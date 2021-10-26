
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class string_reverse_bylist {

	public static void main(String[] args) {
		String str = "123";
		
		char[] arr = str.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for(char each : arr) {
			list.add(each);
		}
		Collections.reverse(list);
		
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}

	}

}
