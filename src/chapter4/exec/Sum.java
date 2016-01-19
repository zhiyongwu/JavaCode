package chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class Sum {
    public static void main(String[] args) {
        double result = 0;
        for (double i = 0; i < 97; i++) {
            result += (i+1)/(i+3);
        }
        System.out.println(result);
    }
}
