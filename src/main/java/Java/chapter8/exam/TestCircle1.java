package Java.chapter8.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c = new Circle1(10);
        System.out.println(c.getArea());
    }
}

class Circle1{
    public double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(){}

    double getArea(){
        return radius * radius * Math.PI;
    }
}
