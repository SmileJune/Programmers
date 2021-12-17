package Quiz1;

import java.util.Arrays;

public class Quiz1_KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answerArray = new int[commands.length];

        getAnswerArray(array, commands, answerArray);

        return answerArray;
    }

    private void getAnswerArray(int[] array, int[][] commands, int[] answerArray) {
        for (int i = 0; i < commands.length; i++) {
            answerArray[i] = getNumber(array, commands[i]);
        }
    }

    private int getNumber(int[] array, int[] command) {
        int lengthOfTruncatedArray = command[1] - command[0] + 1;
        int[] truncatedArray = new int[lengthOfTruncatedArray];

        getTruncatedArray(array, command[0], truncatedArray);
        Arrays.sort(truncatedArray);

        return truncatedArray[command[2] - 1];
    }

    private void getTruncatedArray(int[] array, int i1, int[] truncatedArray) {
        for (int i = 0; i < truncatedArray.length; i++) {
            truncatedArray[i] = array[i1 - 1 + i];
        }
    }
}
