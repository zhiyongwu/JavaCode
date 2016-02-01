package Java.chapter11.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Circle4 extends GeometricObject1 {
    private double radius;

    public Circle4(double radius) {
        this.radius = radius;
    }

    public Circle4(String color, boolean isfilled, double radius) {
        super(color, isfilled);
        this.radius = radius;
//        setColor(color);
//        setIsfilled(isfilled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius* Math.PI;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getperimeter(){
        return 2*radius* Math.PI;
    }

    @Override
    public String toString() {
        return "Circle4{" +
                "radius=" + radius +
                '}';
    }
}
