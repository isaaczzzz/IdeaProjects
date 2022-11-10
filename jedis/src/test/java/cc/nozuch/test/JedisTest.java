package cc.nozuch.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class JedisTest {
    private Jedis jedis;

    @BeforeEach
    void setUp() {
        jedis = new Jedis("106.55.28.228", 6379);
        jedis.auth("123456");
        //选择库
        jedis.select(0);
    }

    @Test
    void testString() {
        String result = jedis.set("name", "zhangsan");
        System.out.println(result);
        String name = jedis.get("name");
        System.out.println(name);
    }

    @Test
    void testHash() {
        jedis.hset("user:1", "name", "Jack");
        jedis.hset("user:1", "age", "21");

        Map<String, String> map = jedis.hgetAll("user:1");
        System.out.println(map);

    }

    @AfterEach
    void tearDown() {
        if (jedis != null) {
            jedis.close();
        }
    }
}
