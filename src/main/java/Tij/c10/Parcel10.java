package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcel10 {
    public Destination destination(final String dest,final float price){
        return new Destination() {
            private int cost;
            @Override
            public String getLabel() {
                return null;
            }
        };
    }
}
