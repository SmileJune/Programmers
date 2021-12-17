package Quiz1;

import java.util.Arrays;
import java.util.Comparator;

public class Quiz1_SortingStrings {
    public String[] solution(String[] strings, int n) {
        sorting(strings, n);
        return strings;
    }

    private void sorting(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }

                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                }

                return -1;
            }
        });
    }
}
