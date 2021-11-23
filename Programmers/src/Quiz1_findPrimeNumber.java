public class Quiz1_findPrimeNumber {
    int answer = 0;
    public int solution(int n) {
        for (int i = 2; i <= n; i++) {
            if (checkPrimNumber(i)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean checkPrimNumber(int m) {
        if(m==2||m==3){return true;}
        if(m%2==0||m%3==0){return false;}
        if (checkOtherCases(m)) return false;
        return true;
    }

    private boolean checkOtherCases(int m) {
        for(int i = 5; i*i<= m; i+=6){
            if(m %i==0|| m %(i+2)==0){
                return true;
            }
        }
        return false;
    }
}