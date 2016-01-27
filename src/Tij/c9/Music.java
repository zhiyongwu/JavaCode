package Tij.c9;

import Tij.c8.Note;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Music {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] i){
        for (Instrument ins:i
             ) {
            tune(ins);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
        tuneAll(orchestra);
    }

}
