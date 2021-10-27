
public class Quiz1_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 3;
		int money = 20;
		int count = 4;
		int sum = 0;
		
		for(int i=1; i<count+1; i++) {
			sum += price*i;
			
		}
		
		int answer= sum - money;
		if(answer<0) {
			answer = 0;
		}
		
		
		System.out.println(answer);
		
		
		
		
		
	}

}
