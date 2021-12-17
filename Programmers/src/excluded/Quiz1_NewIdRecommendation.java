package excluded;

import java.util.Arrays;

public class Quiz1_NewIdRecommendation {
    public String solution(String new_id) {

        new_id = new_id.toLowerCase();

        // 정규 표현식, 패턴 클래스 까먹었다...
        char[] new_idArr = new_id.toCharArray();

        for (int i = 0; i < new_idArr.length; i++) {
            if (cheakAvailableCharacter(new_idArr[i])) {
                continue;
            }
            new_idArr[i] = '#';
        }
        // 여기서 toString 하면 왜 다른 수가 나오지... char[] -> String 에는 다른 방법을 사용해야 한다.
        // https://codechacha.com/ko/java-convert-chararray-to-string/
        new_id = new String(new_idArr);
        new_id = new_id.replace("#", "");


        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");   // 왜 ...........m 이렇게 변하지?
        }

        //0 일때. 1일때. 2일때. 다 따로 생각해야하나.? 천천히 생각해보자.

        while (checkFirstLetterIsDot(new_id)) {
            new_id = new_id.substring(1);
        }

        while (checkLastLetterIsDot(new_id)) {
            new_id = new_id.substring(0, new_id.length()-1);
        }

        if (new_id.length() == 0) {
            new_id = "a";
        }

        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            while (checkLastLetterIsDot(new_id)) {
                new_id = new_id.substring(0, new_id.length()-1);
            }
        }

        while (new_id.length() <= 2) {
            new_id = new_id + new_id.substring(new_id.length() - 1);
        }

        return new_id;
    }

    private boolean cheakAvailableCharacter(char character) {
        if ('a' <= character && character <= 'z') {
            return true;
        }
        if ('A' <= character && character <= 'Z') {
            return true;
        }
        if ('0' <= character && character <= '9') {
            return true;
        }
        if (character == '-' || character == '_' || character == '.') {
            return true;
        }
        return false;
    }

    private boolean checkFirstLetterIsDot(String new_id) {
        return new_id.charAt(0) == '.';
    }

    private boolean checkLastLetterIsDot(String new_id) {
        return new_id.charAt(new_id.length()-1) == '.';
    }

}
