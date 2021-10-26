import java.util.*;

public class Quiz14 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		double[] rate = new double[N+1];
		double[] touch = new double[N+1];
		double[] wait = new double[N+1];
		
		for(int stage : stages) {
			for(int i=0; i<stage; i++) {
				touch[i]++;
			}
			wait[stage-1]++;
		}
		
//		for(int i=0; i<touch.length; i++) {
//			System.out.println(touch[i]);
//		}
//		for(int i=0; i<wait.length; i++) {
//			System.out.println(wait[i]);
//		}
		for(int i=0; i<touch.length; i++) {
			rate[i] = wait[i]/touch[i];
		}
		
		for(int i=0; i<rate.length; i++) {
		System.out.println(rate[i]);
		}
		
		Map<Integer,Double> rate_map = new LinkedHashMap<Integer,Double>();
		for(int i=0; i<rate.length; i++) {
			rate_map.put(i+1, rate[i]);
		}
		
		

	}

}
