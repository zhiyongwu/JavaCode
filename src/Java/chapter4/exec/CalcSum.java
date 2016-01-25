package Java.chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class CalcSum {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 0; i < 624; i++) {
            sum += 1/(Math.sqrt(i+1)+Math.sqrt(i+2));

        }
        System.out.println(sum);
    }
}

