package Quiz2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "1234";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
    }
}
