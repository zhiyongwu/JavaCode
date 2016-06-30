package test;

import org.apache.log4j.Logger;

/**
 * Created by wuzhiyong on 2016/6/30
 */
public class Test {
    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        logger.debug("this is debug info");

        logger.info("this is info message");

        logger.error("this is error message");
    }
}
