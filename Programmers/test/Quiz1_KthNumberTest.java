import Quiz1.Quiz1_KthNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_KthNumberTest {
    Quiz1_KthNumber q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_KthNumber();
    }

    @Test
    void test1() {
        assertArrayEquals(new int[]{5, 6, 3}, q.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
    }
}