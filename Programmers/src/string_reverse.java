
public class string_reverse {

	public static void main(String[] args) {
		String str = "123";

		char[] arr = str.toCharArray();
		char[] reversed_arr = new char[arr.length];
		for(int i=0; i<arr.length; i++){
			reversed_arr[arr.length-1-i] = arr[i];
		}

		String reversed_str = new String(reversed_arr);
		System.out.println(reversed_str);

	}

}
