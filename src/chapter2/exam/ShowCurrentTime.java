package chapter2.exam;

/**
 * Created by Administrator on 2015/12/30.
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        long totalSeconds = time/1000;
        long totalMinutes = totalSeconds/60;
        long totalHours = totalMinutes/60;
        long totalDays = totalHours/24;
        long currentHour = totalHours%24;
        System.out.println(totalSeconds);
        System.out.println(totalMinutes);
        System.out.println(totalHours);
        System.out.println(totalDays/365);
        System.out.println(currentHour);
        System.out.println((double)1/2);
    }
}
