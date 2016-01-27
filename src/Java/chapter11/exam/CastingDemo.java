package Java.chapter11.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class CastingDemo {
    public static void displayObject(Object obj){
        if(obj instanceof Circle4){
            System.out.println("The circle area is " + ((Circle4)obj).getArea());
        }
        else if(obj instanceof Rectangle){
            System.out.println("The rectangle area is " + ((Rectangle)obj).getArea());
        }
    }

    public static void main(String[] args) {
        Object obj1 = new Circle4(1);
        Object obj2 = new Rectangle(2,2);
        displayObject(obj1);
        displayObject(obj2);
    }
}
