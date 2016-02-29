package Tij.c8;

import java.util.Random;

/**
 * Created by Administrator on 2016/1/26.
 */
public class RandomShapeGenerator {
    private Random random = new Random(47);
    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();
        }
    }
}
