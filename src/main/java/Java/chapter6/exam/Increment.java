package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before :" + x);
        increment(x);
        System.out.println("After :" + x);
    }


    public static void increment(int n){
        n++;
        System.out.println("in :" + n);
    }
}
