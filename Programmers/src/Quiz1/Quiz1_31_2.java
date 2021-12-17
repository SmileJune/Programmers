package Quiz1;

import java.util.regex.Pattern;

public class Quiz1_31_2 {
	public static void main(String[] args) {
		String s = "pPoooyY";
		String p_str = "pP";
		String y_str = "yY";
		int p = 0, y = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(Pattern.matches(p_str, s.substring(i, i+1))) {
				p++;
			}
			if(Pattern.matches(y_str, s.substring(i, i+1))) {
				y++;
			}
			
		}
		
		System.out.println(p);
		System.out.println(y);
		
	}
}
