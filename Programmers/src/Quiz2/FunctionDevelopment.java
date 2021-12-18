package Quiz2;

public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] daysToComplete = new int[progresses.length];
        setDaysToComplete(progresses, speeds, daysToComplete);

        StringBuffer stringBuffer = new StringBuffer();
        int pivotNumber = daysToComplete[0];
        int cnt = 0;

        setAnswerByStringBuffer(daysToComplete, stringBuffer, pivotNumber, cnt);
        String[] answer = stringBuffer.toString().split(" ");

        int[] answerToInt = new int[answer.length];
        setAnswerToInt(answer, answerToInt);

        return answerToInt;
    }

    private void setAnswerToInt(String[] answer, int[] answerToInt) {
        for (int i = 0; i < answer.length; i++) {
            answerToInt[i] = Integer.parseInt(answer[i]);
        }
    }

    private void setAnswerByStringBuffer(int[] daysToComplete, StringBuffer stringBuffer, int pivotNumber, int cnt) {
        for (int i = 0; i < daysToComplete.length; i++) {
            if (daysToComplete[i] <= pivotNumber) {
                cnt++;

                isLastElement(daysToComplete, stringBuffer, cnt, i);
                continue;
            }
            stringBuffer.append(cnt);
            stringBuffer.append(" ");
            pivotNumber = daysToComplete[i];
            cnt = 1;

            isLastElement(daysToComplete, stringBuffer, cnt, i);
        }
    }

    private void setDaysToComplete(int[] progresses, int[] speeds, int[] daysToComplete) {
        for (int i = 0; i < progresses.length; i++) {
            daysToComplete[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }
    }

    private void isLastElement(int[] daysToComplete, StringBuffer stringBuffer, int cnt, int i) {
        if (i == daysToComplete.length - 1) {
            stringBuffer.append(cnt);
            stringBuffer.append(" ");
        }
    }
}
