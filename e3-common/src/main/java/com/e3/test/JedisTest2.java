package com.e3.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by 91908 on 2017/12/28.
 */
public class JedisTest2 {
    public static void main(String[] args) {
        //普通连接  单机版连接
        /*Jedis jedis=new Jedis("192.168.177.130",6379);
        jedis.set("key1","测试数据");
        System.out.println(jedis.get("key1"));*/

        //连接池版连接
        JedisPool pool=new JedisPool("192.168.177.130",6379);
        Jedis jedis=pool.getResource();
        jedis.set("key2","连接池");
        System.out.println(jedis.get("key2"));
    }
}
