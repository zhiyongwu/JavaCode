package Tij.c9;

import Java.chapter6.exam.Array;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Apply {
    public static void process(Processor p, Object o) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(o));
    }

    static String s = "Disagreement with beliefs is by difinition incorrect";

    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
    }
}

class Processor {
    public String name() {
        return this.getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }

}


