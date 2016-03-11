package Tij.c14;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
//        a.g();
        System.out.println(a.getClass().getName());
        if ( a instanceof B){
            B b = (B)a;
            b.g();
        }
    }
}

class B implements A{

    @Override
    public void f() {

    }

    public void g(){

    }
}
