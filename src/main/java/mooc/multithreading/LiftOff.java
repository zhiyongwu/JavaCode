package mooc.multithreading;

/**
 * Created by wuzhiyong on 2016/5/16
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "liftoff") + ")";
    }

    @Override
    public void run() {
        while (countDown -- > 0){
            System.out.println(status() + Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
