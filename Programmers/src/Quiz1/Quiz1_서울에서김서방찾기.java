package Quiz1;

public class Quiz1_서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		String answer = "";
		for(int i=0; i<seoul.length;i++) {
			if(seoul[i].contains("Kim")) {
				answer = "김서방은 "+i+"에 있다";
			}
			
		}
		
		System.out.println(answer);

	}

}
