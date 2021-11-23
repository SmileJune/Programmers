package excluded;

import java.util.regex.Pattern;

public class Quiz1_시저암호 {

	public static void main(String[] args) {
		String s = "a B z";
		String regex_A = "^[A-Z]*$";
		String regex_a = "^[a-z]*$";
		StringBuffer sb = new StringBuffer();
		char newChar;
		int n = 4;
		for(int i=0; i<s.length(); i++) {
			if(Pattern.matches(regex_A, s.substring(i, i+1))){
				newChar =Integer.parseInt(s.charAt(i))+n;
				if(newChar>90) {
					newChar -= (91-65);
				}
				sb.append(newChar);
			}
			if(Pattern.matches(regex_a, s.substring(i, i+1))) {
				newChar = s.charAt(i);
				if(newChar
			}
			if(s.substring(i, i+1).contains(" ")){
				sb.append(" ");
			}
			
			
		}
		
		
		//아스키코드 사용법 제대로 모름 공

	}

}
