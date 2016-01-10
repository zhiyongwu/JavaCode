package chapter3.exec;

/**
 * Created by wuzhiyong on 16/1/10.
 */
public class SortRandNumber {
    public static void main(String[] args) {
        Integer[] nums = new Integer[1000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*1000000);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1;j < nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
