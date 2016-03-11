package Tij.c14;

import java.lang.reflect.Method;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HidderC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        C c = (C)a;
        callHiddenMethod(c,"w");
        callHiddenMethod(c,"u");
        callHiddenMethod(c,"v");
        callHiddenMethod(c,"g");
    }

    static void callHiddenMethod(Object o,String methodName) throws Exception{
        Method m = o.getClass().getDeclaredMethod(methodName);
        m.setAccessible(true);
        m.invoke(o);
    }
}
