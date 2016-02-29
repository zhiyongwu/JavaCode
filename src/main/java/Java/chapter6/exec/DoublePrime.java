package Java.chapter6.exec;

/**
 * Created by Administrator on 2016/1/21.
 */
public class DoublePrime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2;; i++) {
            if(PrimeAndPalindrome.isPrime(i) && PrimeAndPalindrome.isPrime(i +2)){
                System.out.printf("(%d %d)\n",i,i + 2);
                count++;
                if(count == 100){
                    break;
                }
            }
        }
    }
}
