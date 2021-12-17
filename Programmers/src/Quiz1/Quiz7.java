package Quiz1;

public class Quiz7 {

	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int answer = 0;
		int sum = 0;
		for(int absolute:absolutes) {
			sum+=absolute;
		}
		
		for(int i=0; i<signs.length; i++) {
			if(signs[i]==false) {
				sum-=(absolutes[i]*2);
			}
		}
		answer = sum;
		
		
		
		
		
		
	}

}
