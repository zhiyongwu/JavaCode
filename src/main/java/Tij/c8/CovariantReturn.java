package Tij.c8;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        WheatMill w = new WheatMill();
        g = w.process();
        System.out.println(g);
    }
}

class Grain {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }

}