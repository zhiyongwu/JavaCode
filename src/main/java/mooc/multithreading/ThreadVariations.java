package mooc.multithreading;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong on 2016/5/17
 * create thread w
 */
public class ThreadVariations {

}


class InnerThread1 {
    private int countDowm = 5;

    private class Inner extends Thread {
        Inner(String name) {
            super(name);
            start();
        }

        @Override
        public String toString() {
            return getName() + ": " + countDowm;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDowm == 0) {
                        return;
                    }
                    sleep(10);
                    {
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


//using an anonymous inner class
class InnerThread2 {
    private int countDown = 5;
    private Thread t;

    public InnerThread2(String name) {
        t = new Thread(name) {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) {
                            return;
                        }
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public String toString() {
                return getName() + ": " + countDown;
            }
        };
        t.start();
    }
}

//using a named runnable implementation
class InnerRunnable1 {
    private int countDown = 5;
    private Inner inner;

    private class Inner implements Runnable {
        Thread t;

        Inner(String name) {
            t = new Thread(this, name);
            t.start();
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) {
                        return;
                    }
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return t.getName() + ": " + countDown;
        }


    }

    public InnerRunnable1(String name) {
        inner = new Inner(name);
    }
}


//using an anonymous Runnable implementation
class InnerRunnable2 {
    private int countDown = 5;
    private Thread t;
    public InnerRunnable2(String  name){
        t = new Thread(new Runnable() {
            @Override
            public String toString() {
                return Thread.currentThread().getName() + " : " + countDown;
            }

            @Override
            public void run() {
                try {
                    while (true){
                        System.out.println(this);
                        if(--countDown == 0){
                            return;
                        }
                        TimeUnit.MILLISECONDS.sleep(10);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}