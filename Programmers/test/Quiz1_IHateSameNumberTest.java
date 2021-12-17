import Quiz1.Quiz1_IHateSameNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_IHateSameNumberTest {

    Quiz1_IHateSameNumber q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_IHateSameNumber();
    }

    @Test
    void 한개() {
        assertArrayEquals(new int[]{5}, q.solution(new int[]{5}));
    }

    @Test
    void test1() {
        assertArrayEquals(new int[]{1, 3, 0, 1}, q.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{4, 3}, q.solution(new int[]{4, 4, 4, 3, 3}));
    }
}