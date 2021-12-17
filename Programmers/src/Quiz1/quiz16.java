package Quiz1;

import java.util.ArrayList;

public class quiz16 {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int cnt= 0;
		int answer = 0;
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=left; i<right+1; i++) {
			nums.add(i);
		}
		
		
		ArrayList<Integer> plus = new ArrayList<Integer>();
		ArrayList<Integer> minus = new ArrayList<Integer>();
		
		for(int num: nums) {
			for(int i=1; i<num+1; i++) {
				if(num%i ==0) {
					cnt++;
				}
			}
			if(cnt%2==0) {
				plus.add(num);
			}
			else {
				minus.add(num);
			}
			cnt=0;
		}
		
		for(int a : plus) {
			answer+=a;
		}
		for(int b : minus) {
			answer-=b;
		}
		
		System.out.println(answer);
		
		
	}

}
