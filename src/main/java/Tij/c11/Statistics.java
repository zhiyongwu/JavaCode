package Tij.c11;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 100000000; i++) {
            int r = rand.nextInt(5);
            Integer freq = map.get(r);
            map.put(r,freq == null ? 1 : freq + 1);
        }

        System.out.println(map);
    }
}

class Test{

}
