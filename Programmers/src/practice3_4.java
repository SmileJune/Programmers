
public class practice3_4 {

	public static void main(String[] args) {
		int n = 25;
		int k = 3;
		int cnt = 0;
		int result = n;
		
		while(n!=1){
			if(n%k==0) {
				n /= k;
				cnt++;
			}
			
			else {
				n-=1;
				cnt++;
			}	
		}
		
		System.out.println(cnt);
		
		
		
		
	}

}
