public class Quiz1_MakingWeirdWord {
    public String solution(String s) {

        String[] words = s.split(" ",-1);

        String[] weirdWords = new String[words.length];
        setWeirdWords(words, weirdWords);

        String answer = "";
        return setAnswer(weirdWords, answer).substring(1);

    }

    private void setWeirdWords(String[] words, String[] weirdWords) {
        for (int j = 0; j < words.length; j++) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < words[j].length(); i++) {
                sb.append(setWeirdWordByCharacterUnit(words, j, i));
            }
            weirdWords[j] = sb.toString();
        }
    }

    private String setAnswer(String[] weirdWords, String answer) {
        for (int i = 0; i < weirdWords.length; i++) {
            answer += (" " + weirdWords[i]);
        }
        return answer;
    }

    private String setWeirdWordByCharacterUnit(String[] words, int j, int i) {
        if (i % 2 == 0) {
            return words[j].substring(i, i + 1).toUpperCase();
        }
        return words[j].substring(i, i + 1).toLowerCase();
    }
}
