package Tij.c7;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Hide {
}

class Homer{
    char doh(char ch){
        System.out.println("char doh");
        return 'd';
    }
    float doh(float f){
        System.out.println("float doh");
        return 1.0f;
    }
}

class MilHouse{}


class Bart extends Homer{
    void doh(MilHouse m){
        System.out.println("Milhouse doh");
    }
}