package Quiz1;

public class Quiz1_수박수박 {

	public static void main(String[] args) {
		int n=4;
		String[] arr = {"수","박"};
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i%2]);
		}
		String answer = sb.toString();
		System.out.println(answer);
			

		
		
		

	}

}
