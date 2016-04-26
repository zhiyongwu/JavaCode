package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class NoSynthesis {
    public static void main(String[] args) {
        new Bird3(1);
        new Bird3(new Float(3));
    }
}

class Bird3 {
    Bird3(int i) {
    }

    Bird3(float i) {
    }
}