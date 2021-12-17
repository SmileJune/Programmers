package Quiz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz1_ArrayOfNumberCanBeDivided {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> listOfNumberCanBeDivided = new ArrayList<>();
        setListOfNumberCanBeDivided(arr, divisor, listOfNumberCanBeDivided);

        if (listOfNumberCanBeDivided.size() == 0) {
            return new int[]{-1};
        }

        Integer[] ArrayOfNumberCanBeDivided = listOfNumberCanBeDivided.toArray(new Integer[0]);

        int[] answer = new int[ArrayOfNumberCanBeDivided.length];
        setAnswerFromArrayOfNumberCanBeDivided(ArrayOfNumberCanBeDivided, answer);
        Arrays.sort(answer);

        return answer;


    }

    private void setAnswerFromArrayOfNumberCanBeDivided(Integer[] ArrayOfNumberCanBeDivided, int[] answer) {
        for (int i = 0; i < ArrayOfNumberCanBeDivided.length; i++) {
            answer[i] = ArrayOfNumberCanBeDivided[i].intValue();
        }
    }

    private void setListOfNumberCanBeDivided(int[] arr, int divisor, List<Integer> listOfNumberCanBeDivided) {
        for (int i = 0; i < arr.length; i++) {
            if (checkNumber(arr[i], divisor)) {
                listOfNumberCanBeDivided.add(arr[i]);
            }
        }
    }

    boolean checkNumber(int number, int divisor) {
        if (number % divisor == 0) {
            return true;
        }
        return false;
    }
}
