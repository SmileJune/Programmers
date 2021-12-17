package Quiz1;

import java.util.Arrays;

public class Quiz2_더맵게 {
	
	public static boolean check(int[] arr, int k) {
		
		for(int a : arr) {
			if(a<k) {return false;}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int K = 7;
		int[] scoville = {1,2,3,9,12,10};
		int cnt  =0;
		
		
		while(!check(scoville,K)) {

			Arrays.sort(scoville);
			int[] scoville_2 = new int[scoville.length-1];
			scoville_2[0]=scoville[0]+scoville[1]*2;
			for(int i=2; i<scoville.length; i++) {
				scoville_2[i-1]=scoville[i];
			}
			scoville = scoville_2;
			for(int s : scoville) {
				System.out.println(s);
			}
			cnt++;
		}
		
		
		System.out.println(cnt);
		
		
	}

}
