package Java.chapter11.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Rectangle extends GeometricObject1{
    private double width;
    private double length;

    public Rectangle(){

    }

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean isfilled, double width,double length) {
        super(color, isfilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2*(width + length);
    }
}
