package Tij.c5;

/**
 * Created by wuzhiyong on 2016/4/26
 */
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloading method");
        }
        new Tree();
    }
}

class Tree {
    int height;

    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating a new Tree that is " + initialHeight + "feet tall");
    }

    void info() {
        System.out.println("tree is " + height + "feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tree is " + height + "feet tall");
    }
}