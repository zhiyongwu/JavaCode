package Tij.c15.generic;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class TwoTuple<A,B> {
    public final A a;
    public final B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class ThreeTuple<A,B,C> extends TwoTuple<A,B>{
    public final C c;
    public ThreeTuple(A a, B b,C c) {
        super(a, b);
        this.c = c;
    }
}