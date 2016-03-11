package Tij.c15.generic.gene;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + id;
    }
}

class Lattee extends Coffee{}

class Cupp extends Coffee{}