package Quiz1;

public class Quiz1_소수만들기 {
	public int solution(int[] nums) {
		int numOfDecimal=0;
		for(int b=2; b<nums.length; b++) {
			for(int a=0; a<b-1; a++) {
				for(int i=a+1; i<b; i++) {
					if(checkDecimal(nums[a]+nums[b]+nums[i])) {
						numOfDecimal++;
					}
				}
			}
		}
		
		return numOfDecimal;
		
		
		
		
	}
	private boolean checkDecimal(int num) {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
