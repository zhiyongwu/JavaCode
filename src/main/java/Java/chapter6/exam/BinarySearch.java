package Java.chapter6.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class BinarySearch {
    public static int binarySearch(int[] num,int key){
        int low = 0;
        int high = num.length - 1;
        while (high >= low){
            int mid = (low + high) / 2;
            if(key == num[mid]){
                return mid;
            }
            else if(key > num[mid]){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return -low-1;
    }


    public static void main(String[] args) {
        int i = binarySearch(new int[]{2,3,4,5,6,7,8,10},3);
        System.out.println(i);
    }
}
