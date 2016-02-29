package Java.chapter8.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Circle3 {
    private double radius;

    private static int numberOfObjects;

    public Circle3(){
        numberOfObjects++;
    }

    public Circle3(double radius) {
        this.radius = radius > 0 ? radius : 0;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }


    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
