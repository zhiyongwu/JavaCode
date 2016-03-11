package Tij.c14;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class HidderC {
    public static A makeA(){
        return new C();
    }
}

class C implements A{

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


}