package Quiz1;

public class Quiz1_24 {

	public static void main(String[] args) {
		
		int n = 5;
		String[] answer = new String[n];
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		int[] binaryArr1 = new int[n];
		int[] binaryArr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				binaryArr1[n-1-j] = arr1[i]%2;
				arr1[i] = arr1[i]/2;
			}
			
			for(int j=0; j<n; j++) {
				binaryArr2[n-1-j] = arr2[i]%2;
				arr2[i] = arr2[i]/2;
			}
			
			StringBuffer sb = new StringBuffer();
			
			
			for(int j=0; j<n; j++) {
				if(binaryArr1[j]==0 && binaryArr2[j]==0) {
					sb.append(" ");
				}
				else {
					sb.append("#");
				}
			}

			answer[i] = sb.toString();
			
			
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
		
	}

}
