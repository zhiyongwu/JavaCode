package Java.chapter13.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class ChainedExceptionDemo {
    public static void method2() throws Exception{
        throw new Exception("New info from method2");
    }

    public static void method1() throws Exception{
        try {
            method2();
        }catch (Exception ex){
            throw new Exception("New info form method1",ex);
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
