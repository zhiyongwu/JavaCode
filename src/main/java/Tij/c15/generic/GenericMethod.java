package Tij.c15.generic;

import Java.chapter6.exam.Array;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class GenericMethod {
    public <T> void f(T t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.f(1);
        gm.f(1.1);
        gm.f('c');
        gm.f("str");
        gm.f(new Array());

    }
}
