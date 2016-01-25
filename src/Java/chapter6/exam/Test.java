package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class Test {
    public static void m(double x,double y){
        System.out.println("Method1");
    }
    public static void m(int x,double y){
        System.out.println("Method2");
    }

    public static void main(String[] args) {
        m(4,5);
        m(4,5.4);
        m(4.5,5.4);//~ 匹配精度更高的方法
    }
}
