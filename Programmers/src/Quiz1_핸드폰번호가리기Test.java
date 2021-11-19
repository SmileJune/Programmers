import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_핸드폰번호가리기Test {
	Quiz1_핸드폰번호가리기 q;

	@BeforeEach
	void setUp() throws Exception {
		q = new Quiz1_핸드폰번호가리기();
	}

	@Test
	void TestFourDigit() {
		assertEquals("1234", q.solution(new String("1234")));
	}
	@Test
	void TestElevenDigit() {
		assertEquals("*******8901", q.solution(new String("12345678901")));
	}
	@Test
	void TestNineDigit() {
		assertEquals("*****6789", q.solution(new String("123456789")));
	}

}
