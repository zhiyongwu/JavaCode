package Java.chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class CalcE {
    public static void main(String[] args) {

        for (int i = 10000; i < 1000000; i+=10000) {
            double e = 1;
            double item = 1;
            for (int j = 1; j < i; j++) {
                e += item;
                item = item/(j+1);
            }
            System.out.println(e);
        }
    }

}
