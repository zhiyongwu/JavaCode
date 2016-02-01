package Java.chapter4.exam;

/**
 * Created by Administrator on 2016/1/13.
 */
public class TestSum {
    public static void main(String[] args) {
        float sum = 0;
        for (float i = 0; i < 1.0f; i += 0.01f) {
            sum += i;
        }
        System.out.println(sum);

        double sum1 = 0;
        for (double i = 0; i < 1.0d; i += 0.01d) {
            sum1 += i;
        }
        System.out.println(sum1);
    }
}
