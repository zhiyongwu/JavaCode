package Java.chapter12.exception;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public enum EnumDemo {

    A("this is a test", 1), B("", 2);
    private String str;
    private int a;

    private EnumDemo(String str, int a) {
        this.str = str;
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        String s = EnumDemo.A.getStr();
        System.out.println(s);
    }
}
