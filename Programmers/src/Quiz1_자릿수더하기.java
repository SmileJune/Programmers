
public class Quiz1_자릿수더하기 {
	int sum = 0;
	
	public static int sum(int m) {
		if(m<10) {return m;}
		return m%10 + sum(m/10);
		
	}

	public static void main(String[] args) {
		int n=123;
		System.out.println(sum(n));
	}

}
