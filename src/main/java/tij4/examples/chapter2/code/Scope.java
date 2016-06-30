package tij4.examples.chapter2.code;

/**
 * Created by wuzhiyong on 2016/6/29
 */
public class Scope {
    int n;
    public static void main(String[] args) {
        int x = 1;
        {
            int y = 2;
        }
        System.out.println(x);

        System.out.println(new Scope().n);
    }
}
