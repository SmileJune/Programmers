import java.util.regex.Pattern;

public class Quiz1_26_2 {

	public static void main(String[] args) {
		String dartResult = "1S2D*10T";
		StringBuffer sb = new StringBuffer(dartResult);
		
		String regexLetter = "^[A-Z]*$";
		String regexNumber = "^[0-9]*$";
		int num = 0;
		
		for(int i=0; i<sb.length(); i++) {
			if(Pattern.matches(regexLetter,sb.substring(i, i+1))){
				if(Pattern.matches(regexNumber, sb.substring(i+1, i+2))) {
					sb.insert(i+1, ',');
				}
				else {
					sb.insert(i+2, ',');
				}
				num++;
				if(num==2) {
					break;
				}
			}
		}
		
//		System.out.println(sb);
		
		String[] arr = sb.toString().split(",");
		int[] ans = new int[3];
		int a=0, b=0, n=0;
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length(); j++) {
				if(Pattern.matches(regexLetter, arr[i].substring(j,j+1))){
					a = Integer.parseInt(arr[i].substring(0,j));
					switch(arr[i].charAt(j)) {
					case 'S' : b=1; break;
					case 'D' : b=2; break;
					case 'T' : b=3; break;
					}
					
					ans[n] = (int) Math.pow(a, b);
					
					
					if(arr[i].charAt(arr[i].length()-1)=='*') {
						ans[n]*=2;
						if(n!=0) {
							ans[n-1]*=2;
						}
					}
					if(arr[i].charAt(arr[i].length()-1)=='#') {
						ans[n]*=(-1);
					}
					n++;
					
					if(n==3) {
						break;
					}
						
				}

			
			}
			
			
			
		}
		
		int answer = 0;
		for(int m : ans) {
			answer+= m;
		}
		
		System.out.println(answer);
		
		
		
		
		
	}

}
