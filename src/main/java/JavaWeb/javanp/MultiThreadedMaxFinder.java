package JavaWeb.javanp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2016/1/25.
 */
public class MultiThreadedMaxFinder {
    public static int max(int[] data) throws InterruptedException,ExecutionException{
        if(data.length == 1){
            return data[0];
        }else if(data.length == 0){
            throw new IllegalArgumentException();
        }

        FinaMaxTask task1 = new FinaMaxTask(data,0,data.length/2);
        FinaMaxTask task2 = new FinaMaxTask(data,data.length/2,data.length);

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> future1 = service.submit(task1);
        Future<Integer> future2 = service.submit(task2);

        return Math.max(future1.get(),future2.get());
    }
}
