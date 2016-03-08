package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            String label;
            @Override
            public String getLabel() {
                return label;
            }
            private PDestination(String label){this.label = label;}
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("");
    }

}
