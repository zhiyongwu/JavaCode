package Java.chapter6.exec;

/**
 * Created by Administrator on 2016/1/21.
 */
public class PrimeAndPalindrome {
    public static boolean isPrime(long num){
        boolean isPrime = true;
        for (long i = num/2; i > 1 ; i--) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isPalindrome(int num){
        boolean isPalindrome = true;
        String s = String.valueOf(num);
        int start = 0;
        int end = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(start) != s.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }


    public static void main(String[] args) {
        int count = 0;
        for (int i = 2;; i++) {
            if(isPrime(i) && isPalindrome(i)){
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0){
                    System.out.println();
                }
                if(count == 100){
                    break;
                }
            }
        }
    }
}
