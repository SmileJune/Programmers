package Quiz1;

public class Quiz4 {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		int k=1;
		int la=3, lb=0, ra=3, rb=2;
		int a, b;
		StringBuffer sb = new StringBuffer();
		
		int[][] dial = new int[4][3];
		for(int i=0;i<4;i++) {
			for(int j=0; j<dial[i].length; j++) {
				dial[i][j]=k;
				k++;
			}
		}
		dial[3][0]=77;
		dial[3][1]=0;
		dial[3][2]=99;
		
		for (int number : numbers) {
			if (number == 1 || number == 4 || number == 7 ) {
				for(int i=0; i<4; i++) {
					for(int j=0; j<3; j++) {
						if(dial[i][j]== number) {
							la=i; lb=j;
							sb.append("L");
						}
					}
				}
			}
			else if(number == 3 || number == 6 || number == 9) {
				for(int i=0; i<4; i++) {
					for(int j=0; j<3; j++) {
						if(dial[i][j]== number) {
							ra=i; rb=j;
							sb.append("R");
						}
					}
				}
			}
			else {
				for(int i=0; i<4; i++) {
					for(int j=0; j<3; j++) {
						if(dial[i][j]== number) {
							a=i; b=j;
							int BetweenL = Math.abs(a-la)+Math.abs(b-lb);
							int BetweenR = Math.abs(a-ra)+Math.abs(b-rb);
							if (BetweenL < BetweenR) {
								la=i; lb=j;
								sb.append("L");
							}
							else if(BetweenL > BetweenR) {
								ra=i; rb=j;
								sb.append("R");
							}
							else {
								if(hand.equals("right")) {
									ra=i; rb=j;
									sb.append("R");
								}
								else {
									la=i; lb=j;
									sb.append("L");
								}
							}
						}
					}
				}
			}
		}
		
		String s= sb.toString();

		System.out.println(s);
	}

}


//배열만든다. [4][3] 12345678977099 숫자 넣는다.
//1 4 7 77 이면 왼손움직이고 포지션 설정.
//3 6 9 99 면 오른손움직이고 포지션 설정.
//2 5 8 0 이면 현재 각 손의 포지션까지 거리를 배열로계산해 
//가까운쪽의 손을 뻗는다. 그 손의 포지션 변경.
// 