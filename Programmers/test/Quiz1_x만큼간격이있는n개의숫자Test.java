import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_x만큼간격이있는n개의숫자Test {
	Quiz1_x만큼간격이있는n개의숫자 q;

	@BeforeEach
	void setUp() throws Exception {
		q = new Quiz1_x만큼간격이있는n개의숫자();
	}

	@Test
	void test1() {
		assertArrayEquals(new long[] {2,4,6,8,10}, q.solution(2, 5));
	}
	@Test
	void test2() {
		assertArrayEquals(new long[] {4,8,12}, q.solution(4, 3));
	}
	@Test
	void test3() {
		assertArrayEquals(new long[] {-4,-8}, q.solution(-4, 2));
	}
	@Test
	void test4() {
		assertArrayEquals(new long[] {-1}, q.solution(-1, 1));
	}

}
