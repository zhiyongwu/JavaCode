package Chapter6.exec;

/**
 * Created by Administrator on 2016/1/20.
 */
public class PentagonalNumber {
    public static int getPentagonalNumber(int n){
        return n*(3*n-1)/2;
    }

    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; i < 100; i++) {
//            System.out.printf("%-10d",getPentagonalNumber(i));
//            count++;
//            if(count % 10 == 0){
//                System.out.println();
//            }
//        }

        System.out.println(sumDigits(1256));
    }


    public static int sumDigits(long n){
        char[] ns = String.valueOf(n).toCharArray();
        int sum = 0;
        for (char ch:ns
             ) {
            sum += ch-'0';
        }
        return sum;
    }
}
