package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class PrintMax {
    public static int getMax(int... num) {
        int max = 0;
        if (num.length == 0) {
            return 0;
        } else {
            for (int i = 0; i <num.length; i++) {
                if (num[i] > max) {
                    max = num[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int m = getMax(1, 2, 17, 5, 3, 12, 35, 5);
        System.out.println(m);
    }
}
