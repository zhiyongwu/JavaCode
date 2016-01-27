package Java.chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class PerfectNum {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(sum);
            }
        }
    }


}
