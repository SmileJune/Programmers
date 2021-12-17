package Quiz1;

public class Quiz1_콜라츠추측 {
	 int numberOfStep = 0;
	 public int solution(int num) {
		 
		 if(num==1) {
			 return 0;
		 }
			 
		 
		 proceedStep((long) num);
		 
		 if(numberOfStep==500) {
			 return -1;
		 }
		 
		 return numberOfStep;
	        
	 }
	 public void proceedStep(long num) {
		 
		 
		 		 
		 if(num%2==0) {
			 num/=2;
			 numberOfStep++;
			 if(numberOfStep==500) {
				 return;
			 }
			 if(num==1) {
				 return;
			 }
			 proceedStep(num);
			 return;
		 }
		 if(num%2!=0) {
			 num*=3;
			 num+=1;
			 numberOfStep++;
			 if(numberOfStep==500) {
				 return;
			 }
			 if(num==1) {
				 return;
			 }
			 proceedStep(num);
			 return;
		 }
	 }
		 
}

//가능하긴하다. 더 복잡해 보이는데 왜 이게 더 좋은 코드인가? 왜 else를 못쓰게 하는거지?
//if블록 내에서 return을 할 경우, else블록이 필요없다.
//설명이 좋은 블로그가 있어서 하단에 첨부한다.