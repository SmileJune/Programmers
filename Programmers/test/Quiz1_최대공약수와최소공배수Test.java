import static org.junit.jupiter.api.Assertions.*;

import Quiz1.Quiz1_최대공약수와최소공배수;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_최대공약수와최소공배수Test {
	
	Quiz1_최대공약수와최소공배수 q;

	@BeforeEach
	void setUp() throws Exception {
		q = new Quiz1_최대공약수와최소공배수();
	}

	@Test
	void test1_1() {
		assertArrayEquals(new int[]{1,1}, q.solution(1, 1));	
	}
	@Test
	void test3_12() {
		assertArrayEquals(new int[]{3,12}, q.solution(3, 12));	
	}
	@Test
	void test2_5() {
		assertArrayEquals(new int[]{1,10}, q.solution(2, 5));	
	}

}
