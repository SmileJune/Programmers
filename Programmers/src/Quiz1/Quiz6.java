package Quiz1;

public class Quiz6 {

	public static void main(String[] args) {
		int[] number = {1,2,3,4,6,7,8,0};
		int sum=0;
		for(int i=0; i<10 ; i++) {
			sum+=i;
		}
		for (int num:number) {
			sum-=num;
		}
		int answer = sum;
		
		System.out.println(answer);

	}

}
