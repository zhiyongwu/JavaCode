package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class LinearSearch {
    public static int linearSearch(int[] num,int key){
        for (int i:num
             ) {
            if(key == i){
                return i;
            }
        }
        return -1;
    }
}
