package mooc.multithreading;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong on 2016/5/17
 */
public class SimpleDaemons implements Runnable{
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + ": " + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new SimpleDaemons());
            t.setDaemon(true);
            t.start();
        }

        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
