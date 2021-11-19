
public class Quiz1_핸드폰번호가리기 {
    public String solution(String phone_number) {
        if(whenFourDigit(phone_number)) {
        	return phone_number;
        }
        return stringOfStar(phone_number) + stringLastFourDigit(phone_number);   	
    }
    
	private String stringLastFourDigit(String phone_number) {
		return phone_number.substring(phone_number.length()-4);
	}
	
	private boolean whenFourDigit(String phone_number) {
		return phone_number.length()==4;
	}
	
    private String stringOfStar(String phone_number) {
    	String sum ="";
    	for(int i=0; i<phone_number.length()-4; i++) {
    		sum+="*";
    	}
    	return sum;
    }
}
