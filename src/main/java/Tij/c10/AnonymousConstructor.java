package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("Inside instance");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}

abstract class Base{
    public Base(int i){
        System.out.println("Base Constructor i = " + i);
    }
    public abstract void f();
}