package Quiz1;

public class Quiz19 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		int[] month_days= {31,29,31,30,31,30,31,31,30,31,30,31};
		
		int days = 0;
		for(int i=0; i<a-1; i++) {
			days += month_days[i];
		}
		
		days += (b-1);
		
		System.out.println(days);
		
		String answer = "";
		switch(days%7) {
			case 0 : answer = "FRI";break;
			case 1 : answer = "SAT";break;
			case 2 : answer = "SUN";break;
			case 3 : answer = "MON";break;
			case 4 : answer = "TUE";break;
			case 5 : answer = "WED";break;
			case 6 : answer = "THU";break;
			
		}
		
		System.out.println(answer);
		// 스위치케이스 브레이크를 걸어줘야되는구나!!!!
	}

}
