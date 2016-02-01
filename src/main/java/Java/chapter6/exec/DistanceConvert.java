package Java.chapter6.exec;

/**
 * Created by Administrator on 2016/1/20.
 */
public class DistanceConvert {
    public static double footToMeter(double foot){
        return .305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("feet          meter         feet        meter");
        System.out.println("------------------------------------------------------");
        for (double i = 1.0,j = 20.0; i <= 10.0 && j <= 65.0; i+=1.0,j += 5.0) {
            System.out.printf("%4.1f      %5.3f            ",i,footToMeter(i));
            System.out.printf("%4.1f      %7.3f\n",j,meterToFoot(j));
        }
    }
}
