
public class test8_1 {

	public static void main(String[] args) {
		
		System.out.println(bino(1000,3));

	}
	
	static int bino(int n, int r) {
		if(r==0 || r==n) {return 1;}
		return bino(n-1, r-1)+bino(n-1, r);
	}

}
