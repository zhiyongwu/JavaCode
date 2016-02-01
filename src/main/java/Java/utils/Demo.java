import java.util.*;

/**
 * Created by Administrator on 2016/2/1.
 */
public class Demo{
    private static final Set<String> numSet = new HashSet<>();
    private static Calendar calendar = Calendar.getInstance();

    //
    public static String randomNum() {
        String randNum = getRandomNum();

        for (; ; ) {
            if (!numSet.contains(randNum)) {
                numSet.add(randNum);
                break;
            } else {
                randNum = getRandomNum();
            }
        }

        return randNum;
    }

    public static void timerTask() {
        calendar.set(Calendar.HOUR_OF_DAY, 24);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                numSet.clear();
            }
        }, calendar.getTime(), 1000);


    }

    private static String getRandomNum() {
        String s = "";
        for (int i = 0; i < 4; i++) {
            s += String.valueOf((int) (Math.random() * 10));
        }
        return s;
    }




}
