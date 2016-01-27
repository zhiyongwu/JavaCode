package Java.chapter11.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Rectangle extends GeometricObject1 implements Comparable{
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

    @Override
    public int compareTo(Object o) {
        if(this.getArea() > ((Rectangle)o).getArea()){
            return 1;
        }else if(this.getArea() < ((Rectangle)o).getArea()) return -1;
        else return 0;
    }

}
