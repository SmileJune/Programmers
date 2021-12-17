package Quiz1;

public class Quiz1_CaesarCipher {
    public String solution(String s, int n) {

        char[] charArray = new char[s.length()];
        convertStringToCharArray(s, charArray);

        char[] newCharArray = new char[s.length()];
        encryptCharArray(n, charArray, newCharArray);

        return new String(newCharArray);


    }

    private void encryptCharArray(int n, char[] charArray, char[] newCharArray) {
        for (int i = 0; i < charArray.length; i++) {
            newCharArray[i] = encrypt(charArray[i], n);
        }
    }

    private void convertStringToCharArray(String s, char[] charArray) {
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
    }

    char encrypt(char element, int n) {
        if (elementIsSpace(element)) {
            return element;
        }

        int newElement = element + n;

        if (lowerLetterIsOverz(newElement)) {
            newElement -= 26;
            return (char) newElement;
        }

        if (elementIsUpperLetter(element)) {
            if (upperLetterIsOverZ(newElement, 'Z')) {
                newElement -= 26;
                return (char) newElement;
            }
        }

        return (char) newElement;
    }

    private boolean upperLetterIsOverZ(int newElement, int z) {
        return z < newElement;
    }

    private boolean elementIsUpperLetter(char element) {
        return element <= 'Z';
    }

    private boolean lowerLetterIsOverz(int newElement) {
        return 'z' < newElement;
    }

    private boolean elementIsSpace(char element) {
        return element == ' ';
    }
}


//    제한 조건
//    공백은 아무리 밀어도 공백입니다.
//        s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//        s의 길이는 8000이하입니다.
//        n은 1 이상, 25이하인 자연수입니다.