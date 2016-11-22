package Java.chapter5.overload;

import java.io.Serializable;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class Demo {
    public void func(Object o){
        System.out.println(o);
    }

    public void func(Serializable s){
        System.out.println("this was invoked");
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Demo().func("str");
    }
}
