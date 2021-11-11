import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_정수제곱근판별Test {

	Quiz1_정수제곱근판별 q;
	
	@BeforeEach
	public void setup() {
		q = new Quiz1_정수제곱근판별();
	}
	
	@Test
	public void whatIsX() {
		assertEquals(36,q.solution(25));
	}
	
	@Test
	public void noX() {
		assertEquals(-1,q.solution(26));
	}
	
	@Test
	public void check1() {
		assertEquals(4,q.solution(1));
	}
	

}
