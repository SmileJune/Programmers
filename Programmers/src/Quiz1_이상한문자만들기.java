
public class Quiz1_이상한문자만들기 {
	public static String change(String st) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<st.length(); i++) {
			if(i%2==0) {
				sb.append(st.substring(i, i+1).toUpperCase());
			}
			else {
				sb.append(st.substring(i, i+1).toLowerCase());
			}	
		}
		return sb.toString();
		
		
	}

	public static void main(String[] args) {
		String s = "try hello world";
		String[] str = s.split(" ");
		String[] arr = new String[str.length];
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str.length; i++) {
			arr[i] = change(str[i]);
		}
		
		for(String a : arr) {
			if(sb.length()!=0) {
				sb.append(" ");
			}
			sb.append(a);
		}
		System.out.print(sb.toString());
		
		
		//히든케이스 통과못
	}

}
