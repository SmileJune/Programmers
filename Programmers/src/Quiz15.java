
public class Quiz15 {

	public static void main(String[] args) {

		int n = 123;
		StringBuffer sb = new StringBuffer();
		while(true) {
			sb.append(n%3);
			n = n/3;
			if(n/3==0) {
				sb.append(n);
				break;
			}
		}
		
		int answer = Integer.parseInt(sb.toString(), 3);
	
		
		
		
		
		
		
		
		
//		
//		String n_string = Integer.toString(n);
//		
//		StringBuffer sb = new StringBuffer(n_string);
//		String n_reversedstring = sb.reverse().toString();
//		
//		System.out.println(n_reversedstring);
//		
//		int a = Integer.parseInt(n_reversedstring,3);
//		System.out.println(a);
		
	}

}
