package Tij.c7;

/**
 * Created by Administrator on 2016/1/26.
 */
public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;
    PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");

    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(0);
    }
}

class Plate{
    public Plate(int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate{
    public DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil{
    Utensil(int i){
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil{
    public Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil{
    public Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil{
    public Knife(int i) {
        super(i);
        System.out.println("Knife constructor");
    }
}

class Custom{
    Custom(int i){
        System.out.println("Custom constructor");
    }
}