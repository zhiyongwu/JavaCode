package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }
}
