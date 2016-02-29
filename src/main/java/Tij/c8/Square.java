package Tij.c8;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Square extends Shape {
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}
