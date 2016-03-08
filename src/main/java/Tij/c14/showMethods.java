package Tij.c14;

/**
 * Created by wuzhiyong on 16/3/8.
 */

import org.json.JSONObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * using reflection to show all the methods of a class
 * even if the methods are defined in the base class
 */
public class showMethods {
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void showMethods() {

        Class<?> c = Integer.class;
        Method[] methods = c.getMethods();
        Constructor[] constructors = c.getConstructors();
        for (int i = 0; i < c.getFields().length; i++) {
            System.out.println(c.getFields()[i]);
        }
        for (Method m : methods
                ) {
            System.out.println(m.getName());
        }

    }

    public static void main(String[] args) {
        showMethods();
    }
}
