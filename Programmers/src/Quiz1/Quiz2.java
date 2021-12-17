package Quiz1;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz2 {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String new_id_1 = new_id.toLowerCase();
		char[] id_1 = new_id_1.toCharArray();
		ArrayList<Character> id_list = new ArrayList<Character>();
		for(int i=0; i<id_1.length ; i++) {
			id_list.add(id_1[i]);
		}
		char[] bans = {'~','!','@','#','$','%','^','&','*','(',')','=','+','[','{',']','}',':','?',',','<','>','/'};

//		왜 둘다 안될까?remove메소드 ban 없을때 문제 되는거 같다.
		
		for(int i=0; i<id_list.size() ; i++) {
			for(int j=0; j<bans.length ; j++) {
				if(id_list.get(i).equals(bans[j])) {
					id_list.remove(i);
					i--;
					break;
				}
			}
		}
//		for(int i=0; i<bans.length ; i++) {
//			id_list.remove(bans[i]);
//		}
		for(int i=0; i<id_list.size()-1; i++) {
			if(id_list.get(i)=='.' && id_list.get(i+1)=='.') {
				id_list.remove(i);
				i--;
			}
		}
		
		while(id_list.get(0)=='.') {
			id_list.remove(0);
		}
		while(id_list.get(id_list.size()-1)=='.') {
			id_list.remove(id_list.size());
		}
		
		if(id_list.size()==0) {
			id_list.add('a');
		}
		
		if(id_list.size()>=16) {
			ArrayList<Character> id_list_final = new ArrayList<Character>();
			for(int i=0; i<15; i++) {
				id_list_final.add(id_list.get(i));
			}
			
		}
		while(id_list.size()<=2) {
			id_list.add(id_list.get(id_list.size()-1));
		}

	

//	
//		System.out.println(id_list);
		System.out.println(id_list.size());
		
	}

}


//1.전부 소문자로 바꾼다.
//    2. -_.~!@#$%^&*()=+[{]}:?,<>/ 가 있다면 위치 호출해서 해당 인덱스 지운다.
//3. 만약 연속된 두 인덱스가 . 이라면 하나를 지운다.
//4. .이 처음이나 끝에 있다면 지운다. 5. 빈 문자열이면 a를 대입한다. 6.16자리 이상이면 15자리까지 잘라. 뒤에 . 이면 잘라
//7. 만약 길이가 2이하라면 3될때까지 - 추가.