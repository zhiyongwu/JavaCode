package Tij.c18;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class Serialization {

}

class Data implements Serializable {
    private int n;

    public Data(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return Integer.toString(n);
    }
}

class Wrom implements Serializable {
    private static Random rand = new Random(47);
    private Data[] d = {
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10)),
            new Data(rand.nextInt(10))
    };
    private Wrom next;
    private char c;

    public Wrom(int i, char c) {
        this.c = c;
        System.out.println("Worm Constructor " + i);
        if(--i > 0){
            next = new Wrom(i,(char)(c + 1));
        }
    }
    public Wrom(){
        System.out.println("Default Constructor");
    }


}
