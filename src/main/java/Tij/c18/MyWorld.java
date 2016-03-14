package Tij.c18;

import java.io.Serializable;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class MyWorld {

}

class House implements Serializable{}

class Animal implements Serializable{
    private String name;
    private House house;

    public Animal(String name, House house) {
        this.name = name;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", house=" + house +
                '}';
    }
}

