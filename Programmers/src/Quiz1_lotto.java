public class Quiz1_lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        return checkHighRankAndLowRank(checkNumberOfZero(lottos), checkNumberOfCorrectNumber(lottos,win_nums));
    }

    private int[] checkHighRankAndLowRank(int numberOfZero, int numberOfCorrect) {
        return new int[]{rank(numberOfZero+numberOfCorrect),rank(numberOfCorrect)};
    }

    private int rank(int n) {
        switch (n) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }

    }

    private int checkNumberOfZero(int[] lottos) {
        int numberOfZero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                numberOfZero++;
            }
        }
        return numberOfZero;
    }

    private int checkNumberOfCorrectNumber(int[] lottos, int[] win_nums) {
        int numberOfCorrectNumber = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    numberOfCorrectNumber++;
                }
            }
        }
        return numberOfCorrectNumber;
    }
}
