package chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class PrintPrime {
    public static boolean isPrime(int num){
        boolean isPrime = true;
        for (int i = num/2; i > 1; i--) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if(isPrime(i)){
                count++;
                System.out.print(i + " ");
                if(count % 8 == 0){
                    System.out.println();
                }
            }
        }
    }
}
