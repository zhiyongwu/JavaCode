package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class SimpleConstructorTest {
    public static void main(String[] args) {
        System.out.println(new Test1().s);
        System.out.println(new Test2().s);
        System.out.println(new Test2());
    }
}

class Test1 {
    String s;
}

class Test2 {
    String s = "s";

    Test2() {
        String s1 = "s1";
    }
}
