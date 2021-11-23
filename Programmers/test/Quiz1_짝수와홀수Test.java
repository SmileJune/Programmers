import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_짝수와홀수Test {

	Quiz1_짝수와홀수 q;
	@BeforeEach
	void setUp() throws Exception {
		q = new Quiz1_짝수와홀수();
	}

	@Test
	void testEven() {
		assertEquals("Even",q.solution(274892));
	}
	
	@Test
	void testOdd() {
		assertEquals("Odd",q.solution(274891));
	}
	
	@Test
	void test0() {
		assertEquals("Even",q.solution(0));
	}
	
	

}
