package Tij.c7;

/**
 * Created by Administrator on 2016/1/26.
 */
public class SpaceShip {
    private String name;

    private SpaceShipControls control = new SpaceShipControls();

    public SpaceShip(String name) {
        this.name = name;
    }

    public void up(int velocity) {
        control.up(velocity);
    }

    public void forward(int velocity) {
        control.forward(velocity);
    }

    public void down(int velocity) {
        control.down(velocity);
    }

    public void back(int velocity) {
        control.back(velocity);
    }

    public void right(int velocity) {
        control.right(velocity);
    }

    public void turboBoost() {
        control.turboBoost();
    }

    public void left(int velocity) {
        control.left(velocity);
    }

    public static void main(String[] args) {
        SpaceShip s = new SpaceShip("z");
        s.back(10);
    }
}
