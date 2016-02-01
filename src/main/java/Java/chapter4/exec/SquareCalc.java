package Java.chapter4.exec;

/**
 * Created by Administrator on 2016/1/15.
 */
public class SquareCalc {
    public static void calcMin(){
        int i = 0;
        while (true){
            if(Math.pow(i,2) > 12000){
                System.out.println(i);
                break;
            }
            i++;
        }
    }


    public static void calcMax(){
        int i = 0;
        while (true){
            if(Math.pow(i,3) > 12000){
                System.out.println(i-1);
                break;
            }
            i++;
        }
    }


    public static void main(String[] args) {
        calcMin();
        calcMax();
    }
}
