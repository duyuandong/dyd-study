package com.dyd.jedis;

import org.apache.commons.lang3.StringUtils;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.jedis.RedisTest
 * @date ：Created in 2023/8/2 15:30
 * @description：
 * @modified By：
 * @version:
 */
public class RedisTest {
    public static void main(String[] args) {
        /*List<String> strings = new ArrayList<>();
        strings.add("192.168.2.141:47000");
        strings.add("192.168.2.141:47001");
        strings.add("192.168.2.142:47000");
        strings.add("192.168.2.142:47001");
        strings.add("192.168.2.143:47000");
        strings.add("192.168.2.143:47001");

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(300);
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMaxWaitMillis(1000);
        jedisPoolConfig.setTestOnBorrow(true);
        SegiRedisClusterBuilder segiRedisClusterBuilder = new SegiRedisClusterBuilder(strings, jedisPoolConfig, 2);
        segiRedisClusterBuilder.setPassword("9MstrX4SgRds826@BDS#sf1");
        segiRedisClusterBuilder.getSegiRedisCluster().setString("jiusi","dsddd",60 * 5);*/

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

        //list
       /* cluster.lpush("CARD_COLLECTION_LOCK","ArrayList", "Vector", "Stack", "HashMap", "WeakHashMap", "LinkedHashMap");
        cluster.lpush("CARD_COLLECTION_LOCK", "HashSet");
        cluster.lpush("CARD_COLLECTION_LOCK", "TreeSet");
        cluster.lpush("CARD_COLLECTION_LOCK", "TreeMap");
        cluster.lpush("CARD_COLLECTION_LOCK","HashSet");*/
       /* List<String> card_collection_lock = cluster.lrange("CARD_COLLECTION_LOCK", 0, -1);
        System.out.println(JSONObject.toJSON(card_collection_lock));
        cluster.lrem("CARD_COLLECTION_LOCK",3,"HashSet");
        List<String> card_collection_lock2 = cluster.lrange("CARD_COLLECTION_LOCK", 0, -1);
        System.out.println(JSONObject.toJSON(card_collection_lock2));
        cluster.del("CARD_COLLECTION_LOCK");
        List<String> card_collection_lock = cluster.lrange("CARD_COLLECTION_LOCK", 0, -1);
        System.out.println(JSONObject.toJSON(card_collection_lock));*/
       //set
        /*cluster.sadd("CARD_COLLECTION_LOCK","ArrayList", "Vector", "Stack", "HashMap", "WeakHashMap", "LinkedHashMap");
        cluster.sadd("CARD_COLLECTION_LOCK", "HashSet");
        cluster.sadd("CARD_COLLECTION_LOCK", "TreeSet");
        cluster.sadd("CARD_COLLECTION_LOCK", "TreeMap");
        cluster.sadd("CARD_COLLECTION_LOCK","HashSet");*/
//        Set<String> card_collection_lock = cluster.smembers("CARD_COLLECTION_LOCK");
//        System.out.println(JSONObject.toJSON(card_collection_lock));
//        cluster.srem("CARD_COLLECTION_LOCK","Vector");
//        cluster.del("CARD_COLLECTION_LOCK");
        //System.out.println("是否存在Vector:{" +cluster.sismember("CARD_COLLECTION_LOCK","Vector") + "}");;
//        cluster.close();

       /* String str = cluster.set("lock2","1234","nx","px",30000);
        System.out.println(str);
        String lock2 = cluster.get("lock2");
        System.out.println(lock2);
        String str2 = cluster.set("lock2","1235","nx","px",30000);
        System.out.println(str2);*/
        String authorization = null;
        System.out.println(authorization);
        if(StringUtils.isEmpty(authorization)) {
            cluster.setex("LUNENG_LOGIN_KEY_"+ "app",60*60*24,"0479bea3-8d35-462f-9ee9-026d7356a00e");
        }
    }

}
