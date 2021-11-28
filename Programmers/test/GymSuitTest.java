import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GymSuitTest {

    GymSuit q;

    @BeforeEach
    void setUp() {
        q = new GymSuit();
    }

    @Test
    void test1() {
        assertEquals(5, q.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    }

    @Test
    void test2() {
        assertEquals(4, q.solution(5, new int[]{2, 4}, new int[]{3}));
    }

    @Test
    void test3() {
        assertEquals(2, q.solution(3, new int[]{3}, new int[]{1}));
    }
}