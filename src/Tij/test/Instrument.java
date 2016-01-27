package Tij.test;

import Tij.c8.Note;

/**
 * Created by Administrator on 2016/1/27.
 */
public interface Instrument {
    void play(Note n);
    int VALUE = 5;
    void adjust();
}
