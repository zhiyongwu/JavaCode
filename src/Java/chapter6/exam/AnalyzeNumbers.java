package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class AnalyzeNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_ELEMENTS = 100;
        double sum = 0;
        double[] array = new double[NUMBER_OF_ELEMENTS];
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            array[i] = (int)(Math.random() * 100);
            sum += array[i];
        }

        double average = sum / NUMBER_OF_ELEMENTS;
        int count = 0;
        for (double num:array
             ) {
            if(num > average){
                count++;
            }
        }
        System.out.printf("%d num is above average",count);
    }
}
