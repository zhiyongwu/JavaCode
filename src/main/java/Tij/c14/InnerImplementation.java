package Tij.c14;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class InnerImplementation {
    public static void main(String[] args) throws Exception {
        A a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        HiddenImplementation.callHiddenMethod(a,"g");
        HiddenImplementation.callHiddenMethod(a,"u");
        HiddenImplementation.callHiddenMethod(a,"w");
        HiddenImplementation.callHiddenMethod(a,"v");
    }
}

class InnerA{
    private static class C implements A{

        @Override
        public void f() {

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

    }

    public static A makeA(){
        return new C();
    }
}
