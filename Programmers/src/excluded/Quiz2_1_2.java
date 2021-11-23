package excluded;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
    	String[] records = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234 Prodo","Enter uid1234 Prodo","Change uid4567 Ryan"};
      HashMap<String,String> map = new HashMap<String,String>();
		ArrayList<String> s = new ArrayList<String>();
		
		for(String record : records) {
			String[] unit = record.split(" ");
			
//			for(String u : unit) {
//				System.out.println(u);
//			}
			map.put(unit[1], unit[2]);
		}
		
		for(String record : records) {
			String[] unit = record.split(" ");
			
////			for(String u : unit) {
////				System.out.println(u);
////			}
				if(unit[0]=="Enter") {
					s.add(map.get(unit[1])+"님이 들어왔습니다.");
				}
				else if(unit[0] == "Leave") {
					s.add(map.get(unit[1])+"님이 나갔습니다.");
				}
				else {
					continue;
				}
				
			}
		String[] answer = new String[s.size()];
		for(int i=0; i<s.size(); i++) {
			answer[i]=s.get(i);
        }
        return answer;
}