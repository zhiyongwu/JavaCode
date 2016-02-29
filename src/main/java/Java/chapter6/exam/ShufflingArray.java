package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class ShufflingArray {
    public static void main(String[] args) {
        double[] array1 = new double[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Math.random()*100;
        }
        for (int i = 0; i < array1.length; i++) {
            int j = (int)(Math.random() * array1.length);
            System.out.print(array1[i] + " ");
            double temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
        }
        System.out.println();
        for (double d:array1
             ) {
            System.out.print(d + " ");
        }
    } 
}
