package Java.chapter6.exec;

/**
 * Created by Administrator on 2016/1/20.
 */
public class PrimeNumbers {

    public static boolean isPrime(int num){
        boolean b = true;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 10000; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
