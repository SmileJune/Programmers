import java.util.Stack;

public class Quiz1_IHateSameNumber {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int lastNumber = -1;
        int newNumber;

        deleteNextSameNumber(arr, stack, lastNumber);

        int[] answer = new int[stack.size()];
        setAnswer(stack, answer);

        return answer;
    }

    private void setAnswer(Stack<Integer> stack, int[] answer) {
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
    }

    private void deleteNextSameNumber(int[] arr, Stack<Integer> stack, int lastNumber) {
        int newNumber;
        for (int i = 0; i < arr.length; i++) {
            newNumber = arr[i];
            if (lastNumber == newNumber) {
                continue;
            }
            stack.push(arr[i]);
            lastNumber = stack.peek();
        }
    }
}
