package mooc.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class PrivateCarReflect {
    public static void main(String[] args) throws Throwable{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> cc = loader.loadClass("mooc.reflect.PrivateCar");

        PrivateCar car = (PrivateCar) cc.newInstance();
        Field field = cc.getDeclaredField("color");
        field.setAccessible(true);
        field.set(car,"红色");
        System.out.println(car);

        Method m = cc.getDeclaredMethod("drive");
        m.setAccessible(true);
        m.invoke(car);

    }
}
