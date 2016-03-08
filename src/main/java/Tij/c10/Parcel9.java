package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String labal = dest;
            @Override
            public String getLabel() {
                return labal;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tas");
    }
}
