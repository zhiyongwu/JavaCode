package Java.chapter12.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class Concurrent implements Runnable{
    private int i;
    private final static int max = 1000000;

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();


    }


    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            
        }
    }
}
