package Chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class PrimeNumberMethod {

    public static void printPrimeNumbers(int numberOfPrime) {
        int num = 2;
        int count = 0;

        while (count < numberOfPrime){
            if(isPrime(num)){
                count ++;
                System.out.printf("%-4d",num);
                if(count % 10 == 0){
                    System.out.println();
                }
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        printPrimeNumbers(50);
    }
}
