package Tij.c21;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class LiftOff implements Runnable{
    protected int countDown = 10;

    private static int taskCount = 0;

    private final int id = taskCount++;

    public LiftOff(){}

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ").";
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.println(status());
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MainThread{
    public static void main(String[] args) {
        LiftOff l = new LiftOff();
        l.run();
    }

}

class BasicThreads{
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for loop");
    }
}

class MoreBasicThreads{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for liftoff");
    }
}