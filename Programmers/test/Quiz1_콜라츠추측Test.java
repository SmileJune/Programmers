import static org.junit.jupiter.api.Assertions.*;

import Quiz1.Quiz1_콜라츠추측;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_콜라츠추측Test {
	
	Quiz1_콜라츠추측 q;

	@BeforeEach
	void setUp() throws Exception {
		q = new Quiz1_콜라츠추측();
	}

	@Test
	void test1() {
		assertEquals(0 ,q.solution(1));
	}
	@Test
	void test6() {
		assertEquals(8,q.solution(6));
	}
	@Test
	void test16() {
		assertEquals(4,q.solution(16));
	}
	@Test
	void test626331() {
		assertEquals(-1,q.solution(626331));
	}
//	@Quiz1.Test
//	void test7999999() {
//		fail("Not yet implemented");
//	}

}
