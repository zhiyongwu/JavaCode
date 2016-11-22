package Java.chapter12.exception;

import java.util.Formatter;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class Main {
    private static final Logger logger = Logger.getLogger("LoggingException");
    public void f() throws SimpleException {
        System.out.println("this");
        throw new SimpleException("this is thrown");
    }

    public static void main(String[] args) {
        try {
            new Main().f();
            Formatter f = new Formatter();

        } catch (SimpleException e) {
            e.printStackTrace();
            logger.severe(e.getLocalizedMessage());
        }
    }
}
