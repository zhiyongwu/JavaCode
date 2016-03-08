package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcell {
    class Contents{
        private int i = 11;
        public int value(){return i;}
    }

    class Destination{
        private String label;
        Destination(String label){
            this.label = label;
        }
        String getLabel(){return label;}
    }

    public void ship(String dest){
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.getLabel());
    }

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("Tas..");
    }
}
