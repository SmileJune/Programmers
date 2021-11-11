
 public class Quiz1_정수제곱근판별 {
	
	 public long solution(long n) {
		 
		 long x;
		 long a = 0;
		 long b = n;
		 
		 if(n==1) {
			 return 4;
		 }
		 
		 x = findX(n, a, b);
		 
		 
		 if(x==-1) {
			 return -1;
		 }
		 
		 
		 return (long) Math.pow(x+1, 2);
		 
	    }

	private long findX(long n, long a, long b) {
		 long half = (a+b)/2;
		 
		 if(half==a || half ==b) {
			 return -1;
		 }
		 
		
		 if(Math.pow(half, 2) == n) {
			 return half;
		 }
		 
		 if(Math.pow(half, 2) > n) {
			 b=half;
		 }
		 
		 if(Math.pow(half, 2) < n) {
			 a=half;
		 }
		 
		 return findX(n, a, b);
	}
}
 
 //시간초과 