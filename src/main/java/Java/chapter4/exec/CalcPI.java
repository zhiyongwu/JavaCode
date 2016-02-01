package Java.chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class CalcPI {
    public static void main(String[] args) {


        for (int n = 10000; n <= 100000000 ; n+=10000) {
            double pi = 0;
            for (int i = 1; i < n;) {
                pi = pi + (double) 1/(2*i++ -1) - (double) 1/(2*i++ - 1);
            }
            System.out.println(pi*4);
        }

    }
}
