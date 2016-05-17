package mooc.multithreading;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong on 2016/5/17
 */
public class DaemonDontRunFinally {
    public static void main(String[] args) {
        Thread t =  new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
}


class ADaemon implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Starting ADaemon");
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Will this run?");
        }
    }
}