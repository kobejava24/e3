package com.e3.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/12/27 0027.
 */
public class JedisTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(JedisTest.class);
        @Test
        public void testJedisCluster() {
            LOGGER.debug("调用redisCluster开始");
            LOGGER.info("创建一个JedisCluster对象");
            LOGGER.debug("设置key1的值为1000");
            LOGGER.debug("从Redis中取key1的值");
            System.out.println("2121");
            try {
                int a = 1 / 0;
            } catch (Exception e) {
                LOGGER.error("系统发送异常", e);
            }
        }
}
