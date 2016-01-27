package Java.chapter4.exec.version10;

/**
 * Created by Administrator on 2016/1/19.
 */
public class RandomPointOnCircle {
    public static void main(String[] args) {
        double x1 = -80 * Math.random() + 40;
        double y1 = Math.sqrt(Math.pow(40,2)-Math.pow(x1,2));
        double x2 = -80 * Math.random() + 40;
        double y2 = Math.sqrt(Math.pow(40,2)-Math.pow(x2,2));
        double x3 = -80 * Math.random() + 40;
        double y3 = Math.sqrt(Math.pow(40,2)-Math.pow(x3,2));

        double a = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
        double b = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(y1-y3,2));
        double c = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

        double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*c*a)));
        double C = Math.toDegrees(Math.acos((c*c-a*a-b*b)/(-2*a*b)));

        System.out.println("Three angles are" +
                Math.round(A*100)/100.0+" "+
                Math.round(B*100)/100.0 +" " +
                Math.round(C*100)/100.0);
    }
}
