package setp.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by wuzhiyong on 2016/6/24
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random ran = new Random();
        Map m = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            int r = ran.nextInt(10);
          if( m.containsKey(r)){
              m.put(r,(int)(m.get(r)) + 1);
          }  else m.put(r,1);
        }
        System.out.println(m);
    }
}
