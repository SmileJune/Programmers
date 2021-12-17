package Quiz1;

public class Quiz2_29 {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		long answer = 0;
		
		for(int i=Math.min(a, b); i<=Math.max(a, b); i++) {
			answer +=i;
		}

		System.out.println(answer);
	}

}
