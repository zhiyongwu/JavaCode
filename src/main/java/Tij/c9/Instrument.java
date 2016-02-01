package Tij.c9;

import Tij.c8.Note;

/**
 * Created by Administrator on 2016/1/27.
 */
abstract class Instrument {
    private int i;
    abstract void play(Note n);

    @Override
    public String toString() {
        return "Instrument";
    }

    abstract void adjust();
}

class Wind extends Instrument{

    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    void adjust() {

    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument{

    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    void adjust() {

    }
}

class Stringed extends Instrument{

    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    void adjust() {

    }
}

class Brass extends Wind{

    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    public String toString() {
        return "Brass";
    }

    @Override
    void adjust() {

    }
}

class Woodwind extends Wind{

    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "Woodwind";
    }

    @Override
    void adjust() {

    }
}


