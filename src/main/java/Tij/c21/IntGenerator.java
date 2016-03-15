package Tij.c21;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/15
 */
public abstract class IntGenerator {
    private volatile boolean cancled = false;
    public abstract int next();
    public void cancel(){cancled = true;}
    public boolean isCancled(){
        return cancled;
    }
}
