package Tij.c15.generic.gene;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class CoffeeGenerator implements Generator<Coffee> ,Iterable<Coffee>{

    private static Class[] types = {Lattee.class,Cupp.class};
    private static final Random rand = new Random(47);

    public CoffeeGenerator(){}
    private int size = 0;

    @Override
    public Coffee next() {
        try {
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return null;
    }
}
