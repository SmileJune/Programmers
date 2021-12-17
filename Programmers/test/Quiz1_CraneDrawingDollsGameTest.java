import Quiz1.Quiz1_CraneDrawingDollsGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_CraneDrawingDollsGameTest {
    Quiz1_CraneDrawingDollsGame q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_CraneDrawingDollsGame();
    }

    @Test
    void test1() {
        assertEquals(4, q.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }
}