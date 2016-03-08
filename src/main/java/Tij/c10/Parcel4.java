package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcel4 {
    private class Pconetents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }


    protected class Pdestination implements Destination {
        private String label;

        @Override
        public String getLabel() {
            return label;
        }

        private Pdestination(String label) {
            this.label = label;
        }


    }

    public Destination destination(String s) {
        return new Pdestination(s);
    }

    public Contents contents() {
        return new Pconetents();
    }


}


class Test {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("tas");

    }
}