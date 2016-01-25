package Java.chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class DivisibleOr {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 200; i++) {
            if(i % 5 == 0 ^ i %6 == 0){
                System.out.print(i + "   ");
                count++;
                if(count % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
