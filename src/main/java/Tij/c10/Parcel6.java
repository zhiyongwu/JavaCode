package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                public String getId() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("zzz");
            ts.getId();
        }
    }

    public void track(){internalTracking(true);}
    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}
