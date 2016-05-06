package mooc.reflect;

import com.sun.istack.internal.NotNull;

/**
 * Created by wuzhiyong on 2016/5/4
 */
public class AnnTest {
    static  @NotNull String s;

    public static void main(String[] args) {
        System.out.println(s);
    }
}
