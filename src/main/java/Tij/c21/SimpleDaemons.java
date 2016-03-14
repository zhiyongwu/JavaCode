package Tij.c21;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class SimpleDaemons implements Runnable{
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        TimeUnit.MILLISECONDS.sleep(10000);
    }
}
