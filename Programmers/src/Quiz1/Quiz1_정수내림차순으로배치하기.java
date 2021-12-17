package Quiz1;

import java.util.Arrays;

public class Quiz1_정수내림차순으로배치하기 {

	public long solution(long n) {
		
		
		String str = Long.toString(n);
		
		if(str.length()==1) {
			return n;
		}
		
		int[] intArray = strTointArray_sorted(str);
		StringBuffer sb = toStringBuffer_reversed(intArray);
		String ans_str =  sb.toString();
		return Long.parseLong(ans_str);
		
	}

	private int[] strTointArray_sorted(String str) {
		int[] intArray = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			intArray[i] = Integer.parseInt(str.substring(i, i+1));
		}
		Arrays.sort(intArray);
		return intArray;
	}

	private StringBuffer toStringBuffer_reversed(int[] intArray) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<intArray.length; i++) {
			sb.append(intArray[i]);
		}
		sb.reverse();
		return sb;
	}

}
