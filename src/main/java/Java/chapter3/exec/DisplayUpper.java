package Java.chapter3.exec;

/**
 * Created by Administrator on 2016/1/12.
 */
public class DisplayUpper {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int rand = (int)(Math.random()*26+65);
            System.out.println((char)rand);
        }

    }
}
