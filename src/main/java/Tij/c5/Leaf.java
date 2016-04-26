package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class Leaf {
    int i = 0;

    Leaf increment() {
        i++;
        return this;
    }
    public String print() {
        return "Leaf{" +
                "i=" + i +
                '}';
    }

    public static void main(String[] args) {
        Leaf l = new Leaf();
        System.out.println( l.increment().increment().increment().print());
    }
}
