package excluded;

import java.util.regex.Pattern;


	public static void main(String[] args) {
		String s = "a234";
		String regex = "^[0-9]*$";
		
		for(int i=0; i<s.length(); i++) {
			if(!Pattern.matches(regex, s.substring(i, i+1))){
				return false;
			}
			return true;
		}

	}

}
//정리필