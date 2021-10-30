import java.util.regex.Pattern;
public class Quiz1_26 {

	public static void main(String[] args) {
		String dartResult = "1S2D*10T";
		String[] arr = new String[3];
		int[] ans = new int[3];
		String numRgx = "^[0-9]*$";//숫자정귯
		int num=0;
		int a=0;
		int b=0;
		int x=0;
		int y=0;
		for(int i=1; i<dartResult.length(); i++) {
			if(Pattern.matches(numRgx,dartResult.substring(i,i+1))){
				b=i;
				arr[num] = dartResult.substring(a, b);
				a=b;
				num++;
			}
		}
		arr[num] = dartResult.substring(a);
		
		for(int i=0; i<arr.length; i++) {
			x = Character.getNumericValue(arr[i].charAt(0));
			switch(arr[i].charAt(1)) {
			case 'S' : y = 1; break;
			case 'D' : y = 2; break;
			case 'T' : y = 3; break;
			}
			if(arr[i].length() ==2) {
				
				ans[i] = (int) Math.pow(x,y);
			}
			else {
				ans[i] = (int) Math.pow(x,y);
				if(arr[i].charAt(2)=='*') {
					ans[i] *= 2;
					if(i!=0) {
						ans[i-1] *= 2;
					}
							
				}
				else {
					ans[i] *= (-1);
				}
			}
				

			
			
		}
		int answer = 0;
		for(int i=0; i<ans.length; i++) {
			answer += ans[i];
		}
		
		System.out.println(answer);
	

	}

}
