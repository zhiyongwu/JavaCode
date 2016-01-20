package Chapter6.exam;

/**
 * Created by Administrator on 2016/1/20.
 */
public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        System.out.println(gcd(125,75));
    }

    public static int gcd(int n1,int n2){
        int gcd = 0;
        int k = 2;
        while (k <=n1 && k <=n2){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
        }
        return gcd;
    }
}
