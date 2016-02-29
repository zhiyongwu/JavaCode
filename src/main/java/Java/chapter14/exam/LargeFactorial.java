package Java.chapter14.exam;

import java.math.BigInteger;

/**
 * Created by Administrator on 2016/1/27.
 */
public class LargeFactorial {
    public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;
        for(long i = 1;i <= n;i++){
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(100));
    }
}
