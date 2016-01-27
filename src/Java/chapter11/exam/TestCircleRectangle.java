package Java.chapter11.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle4 circle4 = new Circle4(1);
        System.out.println("A circle " + circle4.toString());
        System.out.println("radius " + circle4.getRadius());
        System.out.println("area " + circle4.getArea());
        System.out.println("diameter " + circle4.getDiameter());


        Rectangle r = new Rectangle(2,4);
        System.out.println("Rectangle " + r.toString());
        System.out.println("area " + r.getArea());
        System.out.println("perimeter" + r.getPerimeter());
        System.out.println("date" + r.getDateCreated());
    }
}
