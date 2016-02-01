package Tij.test;

import Tij.c8.Note;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Music5 {
}

class Wind implements Instrument{
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {

    }
}
