package Java.chapter14.exam;

import java.util.Date;

/**
 * Created by Administrator on 2016/1/27.
 */
public class House implements Comparable,Cloneable {

    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public int compareTo(Object o) {
        if(this.area > ((House)o).area) return 1;
        else if(this.area < ((House)o).area) return -1;
        else return 0;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", area=" + area +
                ", whenBuilt=" + whenBuilt +
                '}';
    }

    public static void main(String[] args) throws Exception{
        House h1 = new House(1,100);
        House h2 = (House) h1.clone();
        System.out.println(h1);
        System.out.println(h2);

    }
}
