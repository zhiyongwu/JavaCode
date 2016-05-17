package mooc.multithreading;

/**
 * Created by wuzhiyong on 2016/5/17
 */
public class Joining {
    public static void main(String[] args) {
        Sleeper sleepy = new Sleeper("Sleepy", 1500), grummy = new Sleeper("Grumpy", 1500);
        Joiner dopey = new Joiner("Dopey",sleepy),doc = new Joiner("doc",grummy);
        grummy.interrupt();
    }
}

class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int duration) {
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);

        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted" + isInterrupted());
            return;
        }
        System.out.println("has awakened");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName() + "join completed");
    }
}