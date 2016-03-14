package Tij.c21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
