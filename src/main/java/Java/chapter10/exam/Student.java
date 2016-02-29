package Java.chapter10.exam;

import java.util.Date;

/**
 * Created by Administrator on 2016/1/26.
 */
public class Student {
    private int id;
    private String name;
    private Date createDate;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.createDate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreateDate() {
        return createDate;
    }
}
