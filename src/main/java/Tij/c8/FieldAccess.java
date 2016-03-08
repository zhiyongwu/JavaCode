package Tij.c8;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.field);
        System.out.println(s.getField());
        Sub s1 = new Sub();
        System.out.println(s1.field);
        System.out.println(s1.getField());
    }
}

class Super{
    public int field = 0;
    public int getField(){return field;}
}

class Sub extends Super{
    public int field = 1;
    public int getField(){
        return field;
    }
}
