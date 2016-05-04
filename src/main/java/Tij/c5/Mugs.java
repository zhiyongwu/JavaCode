package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class Mugs {
    public static void main(String[] args) {
        f("ss","s");
    }

    static void test1() {
        long cur = System.currentTimeMillis();
        int[] a = new int[51000000];
        for (int i = 0, l = a.length; i < l; i++) {
            a[i] = i;
        }
        System.out.println(System.currentTimeMillis() - cur);
    }

    static void test2() {
        long cur = System.currentTimeMillis();
        int[] a = new int[51000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println(System.currentTimeMillis() - cur);
    }
    static void f(String... args){
        System.out.println(args.getClass().getName());
    }
}
