package Tij.c21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/15
 */
public class EvenChecker implements Runnable{
    private IntGenerator generator;
    private final int id;

    public EvenChecker(int id, IntGenerator generator) {
        this.id = id;
        this.generator = generator;
    }

    @Override
    public void run() {
        while (!generator.isCancled()){
            int val = generator.next();
            if(val % 2 != 0){
                System.out.println(val + " not even");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator generator,int count){
        System.out.println("+++++++++");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(i,generator));
        }
        exec.shutdown();
    }
}
