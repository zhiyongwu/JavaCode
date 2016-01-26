package Java.chapter8.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Circle2 {
    private double radius;
    private static int numberOfObjects = 0;
    Circle2(){
        numberOfObjects++;
    }
    Circle2(double radius){
        this.radius = radius;
        numberOfObjects++;
    }


    public double getArea(){
        return radius * radius * Math.PI;
    }

    public static int getCount(){
        return numberOfObjects;
    }
}

class Test1{
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2(10);
        System.out.println(Circle2.getCount());
    }
}
