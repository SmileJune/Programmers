import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_하샤드수Test {
	
	Quiz1_하샤드수 q;

	@BeforeEach
	void setUp() throws Exception {
		q = new Quiz1_하샤드수();
	}

	@Test
	void test1() {
		assertTrue(q.solution(1));
	}
	@Test
	void test10() {
		assertTrue(q.solution(10));
	}
	@Test
	void test12() {
		assertTrue(q.solution(12));
	}
	@Test
	void test11() {
		assertFalse(q.solution(11));
	}
	@Test
	void test13() {
		assertFalse(q.solution(13));
	}
	@Test
	void test10000() {
		assertTrue(q.solution(10000));
	}
	

}
