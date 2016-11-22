package Java.chapter5.overload;

/**
 * Created by wuzhiyong on 2016/11/22
 */
public class SpaceShip implements Moveable{
    Controller controller = new Controller();
    @Override
    public void move() {
        controller.move();
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.move();
    }
}
