package advanced.dayOne;

import java.util.ArrayList;
import java.util.List;

public class ThreadEven {

    public ThreadEven() {

    }

    public List<Integer> evenNumbers (Integer n) {
        List<Integer> even = new ArrayList<>();
        int count = 1;

        synchronized(this){

            while (count < n) {

                if (n % 2 == 0) {

                    even.add(n);
                    //System.out.println(n);
                }

                n--;
                count++;
            }

        }
        System.out.println(even);
        return even;
    }
    
}
