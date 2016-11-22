package Java.chapter9.interfaces;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class AStrategy implements Strategy {
    @Override
    public void doStrategy() {
        System.out.println("a strategy");
        Class<? extends Number> c = Integer.class;
        System.out.println(c);

    }

    public static <K extends String> K f(){
        return (K)"";
    }
    public static void main(String[] args) {
        new  AStrategy().doStrategy();
    }
}
