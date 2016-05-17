package mooc.multithreading;

import java.util.concurrent.ThreadFactory;

/**
 * Created by wuzhiyong on 2016/5/17
 */
public class DaemonThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
