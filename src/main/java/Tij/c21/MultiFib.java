package Tij.c21;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class MultiFib implements Callable {
    private int n;

    public MultiFib(int n) {
        this.n = n;
    }

    private int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    @Override
    public Integer call() throws Exception {
        return fibo(n);
    }
}

class Test1 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> list = new ArrayList<>();
        for (int i = 10; i < 50; i++) {
            list.add(exec.submit(new MultiFib(i)));
        }
        try {
            for (Future<Integer> fs : list
                    ) {
                System.out.println(fs.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            exec.shutdown();
        }

    }
}