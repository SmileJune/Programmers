import Quiz1.Quiz1_lotto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_lottoTest {
    Quiz1_lotto q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_lotto();
    }

    @Test
    void test1() {
        assertArrayEquals(new int[]{3, 5}, q.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{1, 6}, q.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}));
    }

    @Test
    void test3() {
        assertArrayEquals(new int[]{1, 1}, q.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}));
    }

}