import static org.junit.jupiter.api.Assertions.*;

import Quiz1.Quiz1_정수내림차순으로배치하기;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_정수내림차순으로배치하기Test {
	
	Quiz1_정수내림차순으로배치하기 q;
	
	@BeforeEach
	public void setup() {
		q = new Quiz1_정수내림차순으로배치하기();
	}

	@Test
	public void 한자리수 () {
		assertEquals(4,q.solution(4));
	}

	@Test
	public void 여러자리수() {
		assertEquals(843221,q.solution(128234));
	}
	
}
