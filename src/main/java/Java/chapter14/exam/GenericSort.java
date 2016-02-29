package Java.chapter14.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class GenericSort {


    public static void sort(Comparable[] list){
        Comparable currentMin;
        int currentMinIndex;
        for (int i = 0; i < list.length-1; i++) {
            currentMin = list[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if(currentMin.compareTo(list[j]) > 0){
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
