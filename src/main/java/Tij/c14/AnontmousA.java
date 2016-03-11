package Tij.c14;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class AnontmousA {
    public static A makeA(){
        return new A() {
            @Override
            public void f() {
                System.out.println("C.f()");
            }
            public void g(){
                System.out.println("C.g()");
            }

            void u(){
                System.out.println("package C.u()");
            }
            protected void v(){
                System.out.println("protected C.v()");
            }

            private void w(){
                System.out.println("private C.w()");
            }
        };
    }
}

class Main{
    public static void main(String[] args) throws Exception {
        A a = AnontmousA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        System.out.println();
        HiddenImplementation.callHiddenMethod(a,"g");
        HiddenImplementation.callHiddenMethod(a,"u");
        HiddenImplementation.callHiddenMethod(a,"w");
        HiddenImplementation.callHiddenMethod(a,"v");
    }
}
