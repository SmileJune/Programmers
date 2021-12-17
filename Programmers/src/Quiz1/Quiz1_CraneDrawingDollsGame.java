package Quiz1;

import java.util.Stack;

public class Quiz1_CraneDrawingDollsGame {
    public int solution(int[][] board, int[] moves) {

        int numberOfPopingDolls = 0;
        int lastNumber = -1;
        int newNumber;

        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                newNumber = board[i][move - 1];

                if (newNumber == 0) {
                    continue;
                }

                if (newNumber == lastNumber) {
                    stack.pop();
                    numberOfPopingDolls += 2;

                    lastNumber = setLastNumber(stack);
                    setAZeroAtTheZoneAfterDollIsOut(board, move, i);
                    break;
                }

                stack.push(newNumber);
                lastNumber = newNumber;
                setAZeroAtTheZoneAfterDollIsOut(board, move, i);
                break;
            }
        }


        return numberOfPopingDolls;
    }

    private void setAZeroAtTheZoneAfterDollIsOut(int[][] board, int move, int i) {
        board[i][move - 1] = 0;
    }

    private int setLastNumber(Stack<Integer> stack) {
        int lastNumber;
        if (stack.size() != 0) {
            lastNumber = stack.peek();
        } else {
            lastNumber = -1;
        }
        return lastNumber;
    }
}
