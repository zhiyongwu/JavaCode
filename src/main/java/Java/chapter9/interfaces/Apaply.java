package Java.chapter9.interfaces;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class Apaply {
    private Strategy strategy;

    public Apaply(Strategy strategy) {
        this.strategy = strategy;
    }

    public void apply() {
        this.strategy.doStrategy();
    }


    public static void main(String[] args) {
        Apaply apaply = new Apaply(new BStrategy());
        apaply.apply();
    }
}
