package Java.chapter13.exam;

/**
 * Created by Administrator on 2016/1/27.
 */
public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException() {
        this.radius = 1.0;
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if(radius >= 0){
            this.radius = radius;
        }else throw new IllegalArgumentException("Radius cannot be negative");
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea(){
        return radius* radius * Math.PI;
    }
}

class Test{
    public static void main(String[] args) {
        try {
            CircleWithException c = new CircleWithException(-5);

        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
        }
    }
}
