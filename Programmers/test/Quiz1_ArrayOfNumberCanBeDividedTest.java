import Quiz1.Quiz1_ArrayOfNumberCanBeDivided;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_ArrayOfNumberCanBeDividedTest {

    Quiz1_ArrayOfNumberCanBeDivided q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_ArrayOfNumberCanBeDivided();
    }


    @Test
    void test1() {
        assertArrayEquals(new int[]{5, 10}, q.solution(new int[]{5, 9, 7, 10}, 5));

    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{1, 2, 3, 36}, q.solution(new int[]{2, 36, 1, 3}, 1));

    }

    @Test
    void test3() {
        assertArrayEquals(new int[]{-1}, q.solution(new int[]{3, 2, 6}, 10));

    }

    @Test
    void 길이가1인배열() {
        assertArrayEquals(new int[]{5}, q.solution(new int[]{5}, 5));

    }

}