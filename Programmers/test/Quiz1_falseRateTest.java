
import Quiz1.Quiz1_falseRate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_falseRateTest {

    Quiz1_falseRate q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_falseRate();
    }

    @Test
    void 스테이지1_스테이지스1일경우() {
        Assertions.assertArrayEquals(new int[]{0}, q.solution(1, new int[]{2}));
    }

    @Test
    void test2() {
        Assertions.assertArrayEquals(new int[]{3, 4, 2, 1, 5}, q.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    }

    @Test
    void test3() {
        Assertions.assertArrayEquals(new int[]{4, 1, 2, 3}, q.solution(4, new int[]{4, 4, 4, 4, 4}));
    }
}