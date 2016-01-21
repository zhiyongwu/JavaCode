package chapter6.exec;

/**
 * Created by Administrator on 2016/1/21.
 */
public class DisolaySeries {
    public static double displaySeries(int i){
        double sum = 0;
        for (double j = 1; j <= i; j++) {
            sum += j/(j+1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("i         m(i)");
        System.out.println("_________________");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + "           ");
            System.out.printf("%-5.3f\n",displaySeries(i));
        }
    }
}
