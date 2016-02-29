package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class MoveArray {
    public static void main(String[] args) {
        double[] d = Array.array;
        double dn = d[d.length - 1];
        for (int i = d.length - 1; i > 0; i--) {
            d[i] = d[i -1];
        }
        d[0] = dn;

        for (double s:d
             ) {
            System.out.println(s);
        }
    }

}
