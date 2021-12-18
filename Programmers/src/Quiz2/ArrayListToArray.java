package Quiz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Integer[] listToArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
    }
}
