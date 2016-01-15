package chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class CalcResult {
    public static void main(String[] args) {
        final double n = 50000;
        double result = 0;
        for (double i = n; i >0; i--) {
            result += 1/i;
        }

        System.out.println(result);
    }
}
