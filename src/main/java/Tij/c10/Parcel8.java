package Tij.c10;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/8
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value() * 47;
            }
        };
    }
}
