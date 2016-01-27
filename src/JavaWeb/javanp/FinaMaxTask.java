package JavaWeb.javanp;

import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2016/1/25.
 */
public class FinaMaxTask implements Callable<Integer> {

    private int[] data;
    private int start;
    private int end;

    public FinaMaxTask(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if(data[i] > max) max = data[i];
        }
        return max;
    }
}
