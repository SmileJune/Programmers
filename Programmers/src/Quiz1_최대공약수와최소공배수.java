
public class Quiz1_최대공약수와최소공배수 {
	 public int[] solution(int n, int m) {
		 
		 if(n==1 && m==1) {
			 return new int[]{1,1};
		 }
		 
		int GCD = 1;
		int LCM;
		
		for(int i=2; i<=Math.min(n, m); i++) {
			if(n%i==0 && m%i==0) {
				GCD = i;
			}
		}
		
		LCM = findLCM(n, m, 1, 1);
		 
	        int[] answer = {GCD, LCM};
	        return answer;
	  
	
	 }
	 
	 private int findLCM(int n, int m, int x, int y) {
		 
		if(n*x == m*y) {
			return n*x;
		}
		
		if(n*x > m*y) {
			y++;
		}
		if(n*x < m*y) {
			x++;
		}
		
		return findLCM(n,m,x,y);
	 }
}
