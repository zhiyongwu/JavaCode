package mooc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class ReflectTest {
    public static Car initByDefaultConstructor() throws Throwable{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = loader.loadClass("mooc.reflect.Car");
        Constructor cc = clazz.getConstructor(String.class,String.class,int.class);
        Car car = (Car) cc.newInstance("红旗","12",1);
//        Method m = clazz.getMethod("setBrand",String.class);
//        m.invoke(car,"红旗");
        return car;

    }

    public static void main(String[] args) throws Throwable {
        Car c =  initByDefaultConstructor();
        c.introduce();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("loader = " + loader);
        System.out.println("loader.getParent() = " + loader.getParent());
        System.out.println("loader.getParent().getParent() = " + loader.getParent().getParent());
    }
}
