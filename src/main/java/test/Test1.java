package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wuzhiyong on 2016/6/30
 */
public class Test1 {
    private final Logger logger = LoggerFactory.getLogger(Test1.class);

    void setTemp(int temp) {
        if (temp > 50) {
            logger.info("temp has risen over {} .", temp);
        }
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.setTemp(1);
        t.setTemp(51);
    }
}
