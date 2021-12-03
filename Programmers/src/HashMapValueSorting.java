import java.util.*;
import java.util.Comparator;

public class HashMapValueSorting {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>(5);

        map.put("apple", 1);
        map.put("orange", 2);
        map.put("pineapple", 4);
        map.put("strawberry", 5);
        map.put("melon", 3);

        Map.Entry<String,Integer>[] arr = map.entrySet().toArray(new Map.Entry[0]);



        Arrays.sort(arr, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (Map.Entry<String, Integer> entry : arr) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}

