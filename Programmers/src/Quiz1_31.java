
public class Quiz1_31 {

	public static boolean main(String[] args) {
		String s = "pPoooyY";
		int p = number(s,'p') + number(s,'P');
		int y = number(s,'y') + number(s,'Y');
		
		if(p == y) {
			return true;
		}
		else {
			return false;
		}
		
		
		

	}
	
	public static int number(String str,char c) {
		int num = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				num++;
			}
		}

		return num;
	}

}
