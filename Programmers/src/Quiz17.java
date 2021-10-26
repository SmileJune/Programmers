import java.util.Arrays;

public class Quiz17 {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int cnt = 0;
		
		Arrays.sort(d);
		for(int a : d) {
			if(budget-a>=0) {
				budget-=a;
				cnt++;	
			}
			else {
				break;
			}
		}
		

	}

}
