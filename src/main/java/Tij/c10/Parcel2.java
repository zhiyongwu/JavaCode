package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcel2 {
    class Contents {
        private int i = 11;

        private int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.getLabel());
    }


    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("tas");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("");
    }
}
