import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitTest {
    public static void main(String[] args) {
        String str = "1:2:3:4::::6";

        String[] arr1 = str.split(":");
        String[] arr2 = str.split(":",0);
        String[] arr3 = str.split(":",5);
        String[] arr4 = str.split(":",-1);
        String[] arr5 = str.split(":",-5);


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        System.out.println("-----------------------------");

        str = "1 2    3 4         6";

        String[] arr6 = str.split(" ");
        String[] arr7 = str.split(" ",0);
        String[] arr8 = str.split(" ",5);
        String[] arr9 = str.split(" ",-1);
        String[] arr10 = str.split(" ",-5);

        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr8));
        System.out.println(Arrays.toString(arr9));
        System.out.println(Arrays.toString(arr10));



    }
}