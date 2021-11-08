import java.util.Arrays;

public class Quiz1_32 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String[] arr = new String[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.substring(i, i+1);
		}
		
		Arrays.sort(arr);
		
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			answer = arr[i] + answer;
		}

		
		System.out.println(answer);
	}

}
