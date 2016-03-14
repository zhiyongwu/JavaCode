package Tij.c21;

import java.util.concurrent.ThreadFactory;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class DemoThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread();
        t.setDaemon(true);
        return t;
    }
}
