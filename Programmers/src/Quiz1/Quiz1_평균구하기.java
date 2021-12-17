package Quiz1;

public class Quiz1_평균구하기 {
	 public double solution(int[] arr) {
		 return sumOfArrayElements(arr)/arr.length;
	 }
	 
	 private double sumOfArrayElements(int[] arr) {
		 double sum=0;
		 for(int element : arr) {
			 sum+=element;
		 }
		 return sum;
	}	
}
