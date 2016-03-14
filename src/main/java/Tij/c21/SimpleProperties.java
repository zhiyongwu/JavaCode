package Tij.c21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class SimpleProperties implements Runnable {
    private int countDown = 0;
    private int property;
    private volatile double d;

    public SimpleProperties(int property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ".. :" + countDown;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }
            System.out.println(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimpleProperties(Thread.MIN_PRIORITY));

        }
        exec.execute(new SimpleProperties(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
