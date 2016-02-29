package Java.chapter4.exec.version10;

/**
 * Created by Administrator on 2016/1/20.
 */
public class PlateNumber {
    public static void main(String[] args) {
        char ch1 = (char)((int)(65 + Math.random()*27));
        char ch2 = (char)((int)(65 + Math.random()*27));
        char ch3 = (char)((int)(65 + Math.random()*27));
        char ch4 = (char)((int)(48 + Math.random() * 10));
        char ch5 = (char)((int)(48 + Math.random() * 10));
        char ch6 = (char)((int)(48 + Math.random() * 10));
        char ch7 = (char)((int)(48 + Math.random() * 10));
        System.out.println(ch1+""+ch2+""+ch3+""+ch4+""+ch5+""+ch6+""+ch7);
    }
}
