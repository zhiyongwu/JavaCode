package mooc.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wuzhiyong on 2016/5/17
 */
public class EvenChecker implements Runnable{
    private IntGenerator intGenerator;
    private final int id;

    public EvenChecker(int id, IntGenerator intGenerator) {
        this.id = id;
        this.intGenerator = intGenerator;
    }

    @Override
    public void run() {
        while (!intGenerator.isCanceled()){
            int val = intGenerator.next();
            if(val % 2 != 0){
                System.out.println(val + " not even");
                intGenerator.cancel();
            }
        }
    }

    public static void test(IntGenerator ig,int count){
        ExecutorService exec  = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(i,ig));
        }
        exec.shutdown();
    }

    public static void test(IntGenerator gp){
        test(gp,10);
    }
}
