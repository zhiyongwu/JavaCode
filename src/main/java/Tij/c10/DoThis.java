package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class DoThis {
    void f(){
        System.out.println("DoThis.f()");
    }
    public class Inner{
        public DoThis outer(){
            return DoThis.this;
        }
    }

    public Inner inner(){return new Inner();}

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        DoThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}

class DotNew{
    public DotNew() {
        System.out.println("outer");
    }

    class Inner{
        public Inner() {
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}