package Quiz1;

public class Quiz1_1_2 {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int numOfSameNum = 0;
		int numOf0 = 0;
		
		for(int i=0; i<lottos.length; i++) {
			for(int j=0; j<win_nums.length; j++) {
				if(lottos[i]==win_nums[j]) {
					numOfSameNum++;
				}
			}
			
			if(lottos[i]==0) {
				numOf0++;
			}
		}
		
		int[] answer = new int[2];
		
		
		answer[0] = rank(numOfSameNum + numOf0);
		answer[1] = rank(numOfSameNum);
		
		
		for(int a : answer) {
			System.out.println(a);
		}
	
	}
	
	public static int rank(int n) {
		switch(n) {
		case 6: return 1; 
		case 5: return 2;
		case 4: return 3; 
		case 3: return 4; 
		case 2: return 5;
		default : return 6; 
		}
	}

}