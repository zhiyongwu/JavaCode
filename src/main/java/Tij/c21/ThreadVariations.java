package Tij.c21;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/15
 */
public class ThreadVariations {

}

class InnerThread1{
    private int countDown = 5;
    private Inner inner;
    private class Inner extends Thread{
        Inner(String name){
            super(name);
            start();
        }

        @Override
        public void run() {
            try {
                while (true){
                    System.out.println(this);
                    if(--countDown == 0){
                        return;
                    }
                    sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public InnerThread1(String name){
        inner = new Inner(name);
    }

}

//Inner class 2
class InnerThread2{
    private int countDown = 5;
    private Thread t;
    private InnerThread2(String name){
        t = new Thread(name){
            @Override
            public void run() {
                try {
                    while (true){
                        System.out.println(this);
                        if(--countDown == 0){
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
                return getName() + " " + countDown;
            }
        };
    }
}


//Using runnable
class InnerRunnable{
    private int countDown = 5;
    private Inner inner;
    private class Inner implements Runnable{
        Thread t;
        Inner(String name){
            t = new Thread(this,name);
            t.start();
        }
        @Override
        public void run() {
            try {
                while (true){
                    System.out.println(this);
                    if(--countDown == 0) return;
                    TimeUnit.MILLISECONDS.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return t.getName() + " " + countDown;
        }
    }
    public InnerRunnable(String name){
        inner = new Inner(name);
    }

}


