package Java.chapter11.exam;

import java.util.Date;

/**
 * Created by Administrator on 2016/1/27.
 */
public class GeometricObject1 {
    private String color;
    private boolean isfilled;
    private Date dateCreated;

    public GeometricObject1() {
        dateCreated = new Date();
    }

    public GeometricObject1(String color, boolean isfilled) {
        dateCreated = new Date();
        this.color = color;
        this.isfilled = isfilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isfilled() {
        return isfilled;
    }

    public void setIsfilled(boolean isfilled) {
        this.isfilled = isfilled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject1{" +
                "color='" + color + '\'' +
                ", isfilled=" + isfilled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
