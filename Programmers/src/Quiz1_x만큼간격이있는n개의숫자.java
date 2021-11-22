
public class Quiz1_x만큼간격이있는n개의숫자 {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        makeArray(x, n, answer);
        return answer;
    }

	private void makeArray(int x, int n, long[] answer) {
		for(int i=0; i<n; i++) {
        	answer[i]=(long)x*(i+1);
        }
	}	
}
