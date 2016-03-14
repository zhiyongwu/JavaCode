package Tij.c21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class DaemonThreadFactory implements Runnable{
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newCachedThreadPool(new DemoThreadFactory());
        for (int i = 0; i < 10; i++) {
            exec.execute(new DaemonThreadFactory());
        }
        System.out.println("All started");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
