package Quiz1;

public class Quiz1_하샤드수 {
	 public boolean solution(int x) {
		  return checkHashad(sumOfEachDigit(x), x);
	 }
	 
	 public int sumOfEachDigit(int x) {
		 if(checkUnitDigit(x)) {
			 return x;
		 }
		 return sumOfEachDigit(x/10) + (x%10);
	 }

	 private boolean checkUnitDigit(int x) {
		return x/10==0;
    }
	 
	 private boolean checkHashad(int sumOfNumber, int x) {
		 if(x%sumOfNumber==0) {
			 return true;
		 }
		 return false;
	 }
	 
}
