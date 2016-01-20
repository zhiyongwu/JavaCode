package Chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class TestMax {
    public static int max(int i, int j) {
        return i > j ? i : j;
    }

    public static void main(String[] args) {
        int i = 5, j = 2;
        int k = max(i, j);
        System.out.println(k);
    }
}
