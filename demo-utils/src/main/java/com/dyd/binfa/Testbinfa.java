package com.dyd.binfa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.binfa.Testbinfa
 * @date ：Created in 2023/9/5 16:12
 * @description：
 * @modified By：
 * @version:
 */
public class Testbinfa {
    public static final Logger logger = LoggerFactory.getLogger(Testbinfa.class);

    public static void main(String[] args) {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        // 最大连接数
        poolConfig.setMaxTotal(1);
        // 最大空闲数
        poolConfig.setMaxIdle(1);
        // 最大允许等待时间，如果超过这个时间还未获取到连接，则会报JedisException异常：
        // Could not get a resource from the pool
        poolConfig.setMaxWaitMillis(1000);
        Set<HostAndPort> nodes = new LinkedHashSet<HostAndPort>();
        nodes.add(new HostAndPort("192.168.2.141", 47000));
        nodes.add(new HostAndPort("192.168.2.141", 47001));
        nodes.add(new HostAndPort("192.168.2.142", 47000));
        nodes.add(new HostAndPort("192.168.2.142", 47001));
        nodes.add(new HostAndPort("192.168.2.143", 47000));
        nodes.add(new HostAndPort("192.168.2.143", 47001));
        JedisCluster cluster = new JedisCluster(nodes, 2000, 2000, 2, "9MstrX4SgRds826@BDS#sf1",poolConfig);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 3; i++) {
            executorService.execute(
                    () -> {
                        RedisLock redisLock = new RedisLock(cluster);
                        String value = UUID.randomUUID().toString();
                        long time1 = System.currentTimeMillis();
                        boolean lock = redisLock.getLock("CARD_COLLECTION_LOCK_dyd132", value, 5L);
                        long time2 = System.currentTimeMillis();
                        if(!lock){
                            logger.debug("获取redis分布式锁失败!key={},耗时[{}]ms.", "CARD_COLLECTION_LOCK_dyd132", time2 - time1);
                            return;
                        }
                        try {
                            /*Boolean cardCollectionLock = cluster.sismember("CARD_COLLECTION_LOCK", "dyd132");
                            if(cardCollectionLock){
                                Set<String> cardCollectionLock1 = cluster.smembers("CARD_COLLECTION_LOCK");
                                System.out.println("==============线程:"+Thread.currentThread().getName());
                                System.out.println(JSONObject.toJSON(cardCollectionLock1));
                            }else{
                                cluster.sadd("CARD_COLLECTION_LOCK","dyd132");
                                System.out.println("=======插入成功=======线程:"+Thread.currentThread().getName());
                            }*/
                            Thread.sleep(5000);
                            System.out.println("====有锁===");
                        }catch (Exception ex){
                            ex.fillInStackTrace();
                        }finally {
                            if(lock) {
                                redisLock.unLock("CARD_COLLECTION_LOCK_dyd132", value);
                            }
                        }

                    }
            );
        }
    }
}
