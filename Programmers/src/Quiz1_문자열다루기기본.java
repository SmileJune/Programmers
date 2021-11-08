import java.util.regex.Pattern;

public class Quiz1_문자열다루기기본 {

	public static void main(String[] args) {
		String s = "1234";
		String regex = "^[^0-9]*$";
		
		System.out.println(!Pattern.matches(regex, s));
	//실
		

	}

}
