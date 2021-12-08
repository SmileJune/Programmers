public class Quiz1_CaesarCipher_2 {
    public String solution(String s, int n) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            sb.append(encrypt(s.charAt(i), n));
        }

        return new String(sb);

    }

    char encrypt(char element, int n) {
        if (element == ' ') {
            return element;
        }

        int newElement = element + n;

        if (newElement > 'z') {
            newElement -= 26;
            return (char) newElement;
        }

        if (element <= 'Z') {
            if (newElement > 'Z') {
                newElement -= 26;
                return (char) newElement;
            }
        }
        return (char) newElement;
    }
}
