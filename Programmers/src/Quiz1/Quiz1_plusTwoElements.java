package Quiz1;

import java.util.*;

public class Quiz1_plusTwoElements {
    public int[] solution(int[] numbers) {

        Set<Integer> setOfSum = new HashSet<>();
        getSetOfSum(numbers, setOfSum);

        Integer[] IntegerAnswer = setOfSum.toArray(new Integer[0]);

        int[] answer = new int[IntegerAnswer.length];
        getIntTypeAnswer(IntegerAnswer, answer);

        Arrays.sort(answer);

        return answer;
    }

    private void getIntTypeAnswer(Integer[] IntegerAnswer, int[] answer) {
        for (int i = 0; i < IntegerAnswer.length; i++) {
            answer[i] = IntegerAnswer[i].intValue();
        }
    }

    private void getSetOfSum(int[] numbers, Set<Integer> setOfSum) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                setOfSum.add(numbers[i] + numbers[j]);
            }
        }
    }
}