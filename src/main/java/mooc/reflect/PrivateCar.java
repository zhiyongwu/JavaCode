package mooc.reflect;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class PrivateCar {
    private String color;

    protected void drive(){
        System.out.println("PrivateCar.drice");
    }

    @Override
    public String toString() {
        return "PrivateCar{" +
                "color='" + color + '\'' +
                '}';
    }
}
