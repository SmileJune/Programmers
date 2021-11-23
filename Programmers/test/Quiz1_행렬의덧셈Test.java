import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_행렬의덧셈Test {
	
	Quiz1_행렬의덧셈 q;

	@BeforeEach
	void setUp() throws Exception {
		q = new Quiz1_행렬의덧셈();
	}

	@Test
	void testTwoByTwo() {
		assertArrayEquals(new int[][]{{4,6},{7,9}}, q.solution(new int[][] {{1,2},{2,3}},new int[][]{{3,4},{5,6}}));
	}
	@Test
	void testTwoByOne() {
		assertArrayEquals(new int[][]{{4},{6}}, q.solution(new int[][] {{1},{2}},new int[][]{{3},{4}}));
	}
}
