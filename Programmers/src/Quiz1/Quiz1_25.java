package Quiz1;

public class Quiz1_25 {

	public static void main(String[] args) {
		String s = "abcde";
		
		String answer = new String();
        
        
        if(s.length()%2==0){
            answer = s.substring(s.length()/2-1,s.length()/2+1);
     
        }
        else{
            answer = s.substring((s.length()-1)/2,(s.length()-1)/2+1);
            
        }
		

	}

}
