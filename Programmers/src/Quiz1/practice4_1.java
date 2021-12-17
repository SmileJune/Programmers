package Quiz1;

public class practice4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] move_x= {-1,1,0,0};
		int[] move_y= {0,0,-1,1};
		
		int x=1;
		int y=1;
		
		int n = 5;
		char[] arr = {'R','R','R','U','D','D'};
		
		for(char a : arr) {
			if(a=='L'|| 
				x+move_x[0]>=1||
				x+move_x[0]<=n||
				y+move_y[0]>=1||
				y+move_y[0]<=n) {
				x+=move_x[0];
				y+=move_y[0];
			}
			if(a=='R'|| 
					x+move_x[1]>=1||
					x+move_x[1]<=n||
					y+move_y[1]>=1||
					y+move_y[1]<=n) {
					x+=move_x[1];
					y+=move_y[1];
				}
			if(a=='U' || 
					x+move_x[2]>=1||
					x+move_x[2]<=n||
					y+move_y[2]>=1||
					y+move_y[2]<=n) {
					x+=move_x[2];
					y+=move_y[2];
				}
			if(a=='D' || 
					x+move_x[3]>=1||
					x+move_x[3]<=n||
					y+move_y[3]>=1||
					y+move_y[3]<=n) {
					x+=move_x[3];
					y+=move_y[3];
				}
		}

		System.out.println(x);
		System.out.println(y);
		
		

	}

}
