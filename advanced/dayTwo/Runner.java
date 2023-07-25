package advanced.dayTwo;

import java.util.Arrays;
import java.util.List;

public class Runner implements Runnable {


    @Override
    public void run() {
        List<String> race = Arrays.asList();

        double distanceTravelled = 0d;

        while (distanceTravelled < 100) {

            distanceTravelled = 1 + Math.random() * 100d;
            //System.out.printf("%.2f ", distanceTravelled);
        }

        String win = Thread.currentThread().getName();
        // race.add(win);

        System.out.print(win + " ");
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
