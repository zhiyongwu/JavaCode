package Java.chapter5.overload;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class Flower {
    private int a;
    private String b;

    public Flower(int a) {
        this.a = a;
    }

    public Flower(String b) {
        this.b = b;
    }

    public Flower(int a, String b) {
        this(a);
        this.b = b;
    }
}
