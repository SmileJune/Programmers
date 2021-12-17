import static org.junit.jupiter.api.Assertions.*;

import Quiz1.Quiz1_평균구하기;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_평균구하기Test {
	
	Quiz1_평균구하기 q;

	@BeforeEach
	void setUp() throws Exception {
		q=new Quiz1_평균구하기();
	}

	@Test
	void testOneElement() {
		assertEquals(3,q.solution(new int[] {3}));
	}
	@Test
	void test1234() {
		assertEquals(2.5,q.solution(new int[] {1,2,3,4}));
	}
	@Test
	void test55() {
		assertEquals(5,q.solution(new int[] {5,5}));
	}

}
