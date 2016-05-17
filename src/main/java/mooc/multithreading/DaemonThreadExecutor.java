package mooc.multithreading;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by wuzhiyong on 2016/5/17
 */
public class DaemonThreadExecutor extends ThreadPoolExecutor{
    public DaemonThreadExecutor(){
        super(0,Integer.MAX_VALUE,60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>(),new DaemonThreadFactory());
    }

}
