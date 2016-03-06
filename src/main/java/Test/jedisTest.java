package Test;

import redis.clients.jedis.Jedis;

/**
 * Created by wuzhiyong .
 * Date : 2016/2/29
 */
public class jedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo","bar");
        System.out.println(jedis.get("foo"));
    }
}
