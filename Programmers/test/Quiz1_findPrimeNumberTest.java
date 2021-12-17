import Quiz1.Quiz1_findPrimeNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_findPrimeNumberTest {
    Quiz1_findPrimeNumber q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_findPrimeNumber();
    }

    @Test
    void testTen() {
        assertEquals(4, q.solution(10));
    }

    @Test
    void testFive() {
        assertEquals(3, q.solution(5));
    }

    @Test
    void testTwo() {
        assertEquals(1, q.solution(2));
    }

}