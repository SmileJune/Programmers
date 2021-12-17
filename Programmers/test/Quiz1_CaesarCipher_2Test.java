import Quiz1.Quiz1_CaesarCipher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_CaesarCipher_2Test {

    Quiz1_CaesarCipher q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_CaesarCipher();
    }

    @Test
    void test1() {
        assertEquals(new String("BC"), q.solution(new String("AB"), 1));
    }

    @Test
    void test2() {
        assertEquals(new String("a"), q.solution(new String("z"), 1));
    }

    @Test
    void test3() {
        assertEquals(new String("e F d"), q.solution(new String("a B z"), 4));
    }
}