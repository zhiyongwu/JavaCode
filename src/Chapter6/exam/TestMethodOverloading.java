package Chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class TestMethodOverloading {
    public static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static double max(double n1, double n2, double n3) {
        return n1 > max(n2, n3) ? n1 : max(n2, n3);
    }

    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(2.4,5.2));
        System.out.println(max(3.5,2,5.5));

    }
}
