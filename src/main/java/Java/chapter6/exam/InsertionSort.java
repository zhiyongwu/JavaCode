package Java.chapter6.exam;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/1/26.
 */
public class InsertionSort {
    public static void insertionSort(double[] list){
        for (int i = 1; i < list.length; i++) {
            double currentElement = list[i];
            int k = 0;
            for (k = i - 1; k > 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
          int[][] in = new int[10][];
        }
    }
}
