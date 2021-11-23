import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_소수만들기Test {
	
	Quiz1_소수만들기 q;

	@BeforeEach
	void setUp() throws Exception {
		try {
			q = new Quiz1_소수만들기();
		}
		catch (Exception e) {
			System.out.println("예외");
		}
	}

	@Test
	void test1234() {
		assertEquals(1, q.solution(new int[]{1,2,3,4}));
	}
	@Test
	void test12764() {
		assertEquals(4, q.solution(new int[]{1,2,7,6,4}));
	}
	@Test
	void test124() {
		assertEquals(1, q.solution(new int[] {1,2,4}));
	}

}
