package Quiz1;

public class Studystring {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String new_id_1 = new_id.toLowerCase();
		char[] id_1 = new_id_1.toCharArray();
		char[] id_11 = id_1;
		char[] ban = {'~','!','@','#','$','%','^','&','*','(',')','=','+','[','{',']','}',':','?',',','<','>','/'};
		
		for(int i=0;i<id_1.length;i++) {
			for(int j=0; j<ban.length;j++) {
				if(id_1[i] == ban[j]) {
					id_1[i]=id_11[i+1];
					i--;
				}
			}
		}
	
		
		
		
		for(int i = 0 ; i < id_1.length ;i++) {
			System.out.println(id_1[i]);
		}
		
		

		
		
		
		
		}
		
		
}


