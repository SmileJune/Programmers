
public class Quiz1_소수찾기 {
	
	public static boolean check(int m) {
		if(m==1) {return false;}
		if(m==2) {return true;}
		for(int i=2; i<m; i++) {
			if(m%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n=10;
		int cnt=0;
		
		for(int i=1; i<=n; i++) {
			if(check(i)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
//시간초
	}

}
