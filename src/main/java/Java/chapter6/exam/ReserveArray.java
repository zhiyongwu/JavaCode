package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class ReserveArray {
    public static void main(String[] args) {
        double[] arr = Array.array;
        double[] result = new double[arr.length];
        for (int i = 0,j = arr.length - 1; i < arr.length; i++,j --) {
            result[j] = arr[i];
        }
        for (double d:result
             ) {
            System.out.println(d);
        }
    }
}
