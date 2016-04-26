package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("s = [" + s + "], i = [" + i + "]");
    }

    static void f(int i, String s) {
        System.out.println("i = [" + i + "], s = [" + s + "]");
    }

    public static void main(String[] args) {
        f("s", 3);
        f(3, "s");
    }
}
