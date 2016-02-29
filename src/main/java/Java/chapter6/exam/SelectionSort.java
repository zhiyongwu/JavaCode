package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class SelectionSort {
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = 0;
            for (int j = i + 1; j < list.length; j++) {
                if(list[j] < currentMin){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
