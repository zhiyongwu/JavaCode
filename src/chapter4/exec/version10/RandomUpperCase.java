package chapter4.exec.version10;

/**
 * Created by Administrator on 2016/1/19.
 */
public class RandomUpperCase {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int n = (int)(65 + Math.random() * 27);
            System.out.println((char)n);
        }

    }
}
