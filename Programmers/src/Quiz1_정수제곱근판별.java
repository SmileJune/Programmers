
 public class Quiz1_정수제곱근판별 {
	
	 public long solution(long n) {
		 
		 long x=-1;
		 for(int i=1; i<=n/2; i++) {
			 if(Math.pow(i, 2)==n) {
				 x=i;
			 }
		 }
		 
		 if(x==-1) {
			 return -1;
		 }
		 
		 
		 return (long) Math.pow(x+1, 2);
		 
	    }
	}
 
 //시간초