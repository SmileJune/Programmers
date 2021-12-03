import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapKeySorting {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>(5);

        map.put(1, "apple");
        map.put(4, "pineapple");
        map.put(2, "orange");
        map.put(5, "strawberry");
        map.put(3, "melon");

        Object[] mapKey = map.keySet().toArray();
        Arrays.sort(mapKey);

        for(Object nKey : map.keySet()){
            System.out.println(map.get(nKey));
        }
    }
}

// 키는
