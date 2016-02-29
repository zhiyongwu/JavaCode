package Tij.c7;

import java.util.Random;

/**
 * Created by Administrator on 2016/1/26.
 */
public class FinalData {
    private static Random ran = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;

    private static final int VALUE_TWO = 99;
    public static final  int VALUE_THREE = 39;
    private final int i4 = ran.nextInt(20);
    static final int INT_5 = ran.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", i4=" + i4 +
                '}';
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        fd1.v2.i++;

    }
}

class Value{
    int i;
    public Value(int i){
        this.i = i;
    }
}
