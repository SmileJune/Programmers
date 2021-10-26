
public class StudyString2 {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String new_id_1 = new_id.toLowerCase();
		char[] id_1 = new_id_1.toCharArray();
		char[] id_11 = new char[id_1.length+1];
		id_11[id_1.length]='.';
		char[] ban = {'~','!','@','#','$','%','^','&','*','(',')','=','+','[','{',']','}',':','?',',','<','>','/'};
		
		for(int i=0;i<id_1.length;i++) {
			for(int j=0; j<ban.length;j++) {
				if(id_1[i] == ban[j]) {
					for(int k=i; k<id_1.length;k++) {
						id_1[k]=id_11[k+1];
					
					
					}
					i--;
					
				}
			}
		}
		
		
		for(int i = 0 ; i < id_1.length ;i++) {
			System.out.println(id_1[i]);
		}
		
		

		
		
		
		
		}
		
		
}