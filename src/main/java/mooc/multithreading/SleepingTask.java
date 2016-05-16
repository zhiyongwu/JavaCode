package mooc.multithreading;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong on 2016/5/16
 */
public class SleepingTask extends LiftOff{
    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.println(status());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new SleepingTask()).start();
        }
    }
}
