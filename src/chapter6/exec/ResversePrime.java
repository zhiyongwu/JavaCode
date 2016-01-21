package chapter6.exec;

/**
 * Created by Administrator on 2016/1/21.
 */
public class ResversePrime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2;; i++) {
            if(PrimeAndPalindrome.isPrime(i) && PrimeAndPalindrome.isPrime(reverse(i)) && !PrimeAndPalindrome.isPalindrome(i)){
                System.out.print(i + " ");
                count++;
                if(count % 10 == 0){
                    System.out.println();
                }
                if(count == 100){
                    break;
                }
            }
        }

    }

    public static int reverse(int num){
        int r = 0;
        String s = String.valueOf(num);
        for (int i = s.length() - 1; i >=0; i--) {
            r = r*10 + (s.charAt(i) - '0');
        }
        return r;
    }
}
