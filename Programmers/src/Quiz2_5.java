
public class Quiz2_5 {

	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		int mini_w = w;
		int mini_h = h;
		
		for(int i=2; i<=Math.min(h, w); i++) {
			if(mini_w%i==0 && mini_h%i == 0) {
				mini_w = mini_w/i;
				mini_h = mini_h/i;
				i = 1;
			}
		}
		
		long answer = w*h - (Math.max(mini_w, mini_h)+1)*(Math.max(h, w)/Math.max(mini_h, mini_w));
		
		System.out.println(answer);

	}

}
