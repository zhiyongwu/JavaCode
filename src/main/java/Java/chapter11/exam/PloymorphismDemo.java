package Java.chapter11.exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/27.
 */
public class PloymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle4("red", true, 1));
        displayObject(new Rectangle("white", true, 2, 2));

    }

    public static void displayObject(GeometricObject1 obj) {
        System.out.println(obj.getClass().getSimpleName() + " Created on :" + obj.getDateCreated() + " Color is " + obj.getColor());
    }
}
