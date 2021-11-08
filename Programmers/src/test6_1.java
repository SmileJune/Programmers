
public class test6_1 {

	public static void main(String[] args) {
		int sum = 0;
	
		sum = sum_all(10);
		
		System.out.println(sum);
		
		
	}
	
	static int sum_all(int n) {
		int m = 0;
		if (n==1){return 1;};
		m = n + sum_all(n-1);
		return m;
	}
	
	

}
