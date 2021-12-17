package Quiz1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DoubleComparator {
    public static void main(String[] args) {
        Double[] arr = {1.3, 8.34, 24.0, 3.0, 5.0, 7.456, 3.0};

        Arrays.sort(arr, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                double c1 = o1;
                double c2 = o2;
                return Double.compare(c2,c1);
            }
        });

        System.out.println(Arrays.toString(arr));


    }
}

