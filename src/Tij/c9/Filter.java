package Tij.c9;

/**
 * Created by Administrator on 2016/1/27.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public WaveForm process(WaveForm input){return input;}
}


class LowPass extends Filter{
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}

class HighPass extends Filter{
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}

class BandPass extends Filter{
    double lowCutoff,highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}