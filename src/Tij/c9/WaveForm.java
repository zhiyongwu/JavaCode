package Tij.c9;

/**
 * Created by Administrator on 2016/1/27.
 */
public class WaveForm {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
