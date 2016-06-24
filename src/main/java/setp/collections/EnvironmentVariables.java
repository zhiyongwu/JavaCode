package setp.collections;

import java.util.Map;

/**
 * Created by wuzhiyong on 2016/6/24
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
