import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Quiz1_30 {

	public static void main(String[] args) {
		String[] strings = {"sun","bed","car"};
		int n = 1;
		
		Map<String, String> map = new HashMap<String, String>();
		
		for(String str : strings) {
			map.put(str, str.substring(n));
		}
		
		List<Entry<String, String>> list_entries = new ArrayList<Entry<String,String>>(map.entrySet());
	
		
		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, String>>() {
			// compare로 값을 비교
			public int compare(Entry<String, String> obj1, Entry<String, String> obj2) {
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
				
				
		int i=0;
		String[] answer = new String[strings.length];
		for(Entry<String, String> entry : list_entries) {
			answer[i]=entry.getKey();
			i++;
			
		}
	
		

	}
}
