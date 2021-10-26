
public class Quiz11 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int numberOfanswers = 0;
		int[] method1_2 = {};
		int[] method2_2 = {};
		int[] method3_2 = {};
		
		 int[] method1 = {1,2,3,4,5};
	     int[] method2 = {2, 1, 2, 3, 2, 4, 2, 5};
	     int[] method3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	     
	     for(int i=0; i<method1.length; i++) {
	    	 method1_2[i] = method1[i];
	    	 numberOfanswers++;
	    	 if(answers.length == numberOfanswers) {
	    		 break;
	    	 }
	    	 if(i==method1.length-1) {
	    		 
	    	 }
	    	 
	     }
	    

	}

}
