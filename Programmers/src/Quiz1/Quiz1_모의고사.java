package Quiz1;

public class Quiz1_모의고사 {

	public static int count(int[] array, int[] ans) {
		int cnt = 0;
		for(int i=0; i<ans.length; i++) {
			if(ans[i]==array[i%array.length]) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,1,2,3,2,4,2,5};
		int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
		
		int[] arr = {count(arr1,answers),count(arr2,answers),count(arr3,answers)};		

		
		int max=0;
		for(int a : arr) {
			max = Math.max(a,max);
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<3; i++) {
			if(arr[i]==max) {
				if(sb.length()!=0) {
					sb.append(",");
				}
				sb.append(i+1);
			}
		}
		String [] semi_answer = sb.toString().split(",");
		int[] answer = new int[semi_answer.length];
		for(int i=0; i<semi_answer.length; i++) {
			answer[i] = Integer.parseInt(semi_answer[i]);
		}
		for(int a : answer) {
			System.out.println(a);
		}
		
		
	}

}
