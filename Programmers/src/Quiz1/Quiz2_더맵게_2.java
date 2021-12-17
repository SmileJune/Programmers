package Quiz1;

import java.util.Arrays;

public class Quiz2_더맵게_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int K = 7;
		int[] scoville = {1,2,3,9,12,10};
		int cnt  =0;
		
		for(int i=0; i<scoville.length; i++) {
			if(scoville[i]<K) {
				Arrays.sort(scoville);
				int[] arr = new int[scoville.length-1];
				arr[0] = scoville[0]+scoville[1]*2;
				for(int j=2; j<scoville.length; j++) {
					arr[j-1]=scoville[j];
				}
				scoville = arr;
				cnt++;
				i=-1;		
			}
			
		}
		System.out.print(cnt);
		
		
		
		
	}

}
