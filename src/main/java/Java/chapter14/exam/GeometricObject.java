package Java.chapter14.exam;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2016/1/27.
 */
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends GeometricObject{

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}

class Test2{
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getColor());
    }
}
