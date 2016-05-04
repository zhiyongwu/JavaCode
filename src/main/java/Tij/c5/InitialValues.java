package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    @Override
    public String toString() {
        return "InitialValues{" +
                "t=" + t +
                ", c=" +'[' + c + ']' +
                ", b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new InitialValues());
    }
}
