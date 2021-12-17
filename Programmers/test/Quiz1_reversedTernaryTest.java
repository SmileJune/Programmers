import Quiz1.Quiz1_reversedTernary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_reversedTernaryTest {

    Quiz1_reversedTernary q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_reversedTernary();
    }

    @Test
    void test1() {
        assertEquals(7, q.solution(45));
    }

    @Test
    void test2() {
        assertEquals(229, q.solution(125));
    }

}