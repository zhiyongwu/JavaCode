package Java.chapter4.exam;

/**
 * Created by Administrator on 2016/1/13.
 */
public class MonteCarloSimulation {
    public static void main(String[] args) {
        final int NUMBER_OF_TRIALS = 1000000000;
        int numberOfHits = 0;

        for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
            double x = Math.random()*2.0 - 1;
            double y = Math.random()*2.0 - 1;

            if(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) < 1){
                numberOfHits++;
            }
        }


        double pi = 4.0 * numberOfHits / NUMBER_OF_TRIALS;
        System.out.println(pi);
    }
}
