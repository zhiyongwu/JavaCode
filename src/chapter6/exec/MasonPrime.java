package chapter6.exec;

/**
 * Created by Administrator on 2016/1/21.
 */
public class MasonPrime {
    public static void main(String[] args) {
        for (int i = 0;i <= 32; i++) {
            if(PrimeAndPalindrome.isPrime((long)Math.pow(2,i) - 1)){
                System.out.println((long)Math.pow(2,i) - 1);
            }
        }
    }
}
