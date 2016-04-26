package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class OverloadingConstructor {
}

class Test4 {
    Test4(int n) {
    }

    Test4() {
        this(3);
    }

}
