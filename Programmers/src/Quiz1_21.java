import java.util.Arrays;

public class Quiz1_21 {

	public static void main(String[] args) {
		
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		
	
		
//		System.out.println(sizes.length);
		
		for(int[] size : sizes) {
			Arrays.sort(size);
		}
		
		int x_max = 0;
		int y_max = 0;
		
		for(int i=0; i<sizes.length; i++) {
			x_max = Math.max(sizes[i][0], x_max);
		}
		for(int i=0; i<sizes.length; i++) {
			y_max = Math.max(sizes[i][1], y_max);
		}
		
		int answer = x_max * y_max;
		
		System.out.print(answer);
			
		
		
		
	}

}
