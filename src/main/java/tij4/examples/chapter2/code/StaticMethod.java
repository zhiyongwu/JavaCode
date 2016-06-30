package tij4.examples.chapter2.code;

/**
 * Created by wuzhiyong on 2016/6/29
 */
public class StaticMethod {
    static int i = 47;
    static void func(){
        System.out.println("func");
    }
}

class Test{
    public static void main(String[] args) {
        StaticMethod st1 = new StaticMethod();
        StaticMethod st2 = new StaticMethod();
        System.out.println(st1.i);
        System.out.println(st2.i);
        st1.func();
        StaticMethod.func();
    }
}
