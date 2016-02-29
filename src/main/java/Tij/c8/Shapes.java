package Tij.c8;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape sh:s
             ) {
            sh.draw();
        }
    }
}
