package com.dyd.binfa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.JedisCluster;

import java.util.Random;


public class RedisLock {

    private static final Logger logger = LoggerFactory.getLogger(RedisLock.class);
    private static final Random RANDOM = new Random();
    private static final int EXPIRE = 60 * 1000;//毫秒

    private final JedisCluster cluster;

    public RedisLock(JedisCluster cluster) {
        this.cluster = cluster;
    }

    public boolean getLock(String key, String value, long waitSecond) {
        long nano = System.nanoTime();
        long timeout = waitSecond * 1000000000L;
        try {
            while(System.nanoTime() - nano < timeout) {
                String str = cluster.set(key, value, "NX", "PX", EXPIRE);
                if("ok".equalsIgnoreCase(str)){
                    return true;
                }
                Thread.sleep(3L, RANDOM.nextInt(500));
            }
        } catch (Exception e) {
            logger.error("【获取Redis分布式锁异常】: {}", e.getMessage(), e);
        }
        return false;
    }

    public boolean getLock(String key, String value, long millisecond, long waitSecond) {
        long nano = System.nanoTime();
        long timeout = waitSecond * 1000000000L;
        try {
            while(System.nanoTime() - nano < timeout) {
                String str = cluster.set(key, value, "NX", "PX", millisecond);
                if("ok".equalsIgnoreCase(str)){
                    return true;
                }
                Thread.sleep(3L, RANDOM.nextInt(500));
            }
        } catch (Exception e) {
            logger.error("【获取Redis分布式锁异常】: {}", e.getMessage(), e);
        }
        return false;
    }

    public boolean unLock(String key, String value) {
        try {
            //lua脚本原子操作判断是否是自己的锁：
            // if redis.call('get',#{key})==#{value} then return redis.cal('del',#{key}) else return 0 end
            String script = String.format("if redis.call('get','%s')=='%s' then return redis.call('del','%s') else return 0 end", key, value, key);
            String str = cluster.eval(script, key).toString();
            return Integer.valueOf(str) == 1;
        } catch (Exception e) {
            logger.error("【释放Redis分布式锁异常】: {}", e.getMessage(), e);
        }
        return false;
    }
}
