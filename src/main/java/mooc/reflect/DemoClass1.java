package mooc.reflect;

/**
 * Created by wuzhiyong on 2016/5/3
 */
public class DemoClass1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Foo f = new Foo();
        Class c = Foo.class;

        Class c2 = f.getClass();

        Class c3 = Class.forName("mooc.reflect.Foo");
        System.out.println(c3.toGenericString());
    }
}

class Foo{}
