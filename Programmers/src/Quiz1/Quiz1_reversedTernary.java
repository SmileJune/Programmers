package Quiz1;

public class Quiz1_reversedTernary {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer();
        return Integer.parseInt(getTernaryReversedString(n,sb),3);
    }

    String getTernaryReversedString(int n, StringBuffer sb) {

        if (n / 3 >= 1) {
            sb.append(n % 3);
            n /= 3;
        } else {
            sb.append(n);
            return sb.toString();
        }

        return getTernaryReversedString(n,sb);
    }
}
