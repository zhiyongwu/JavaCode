package Java.chapter4.exam;

/**
 * Created by Administrator on 2016/1/13.
 */
public class FutureTuition {
    public static void main(String[] args) {
        int year = 1;
        double tuition = 10000;
        do {
            tuition *= (1 + 0.07);
            year ++;
        }while (tuition < 20000);
        System.out.println(year);
    }
}
