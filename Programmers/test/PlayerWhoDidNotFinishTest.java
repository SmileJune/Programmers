import Quiz1.PlayerWhoDidNotFinish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerWhoDidNotFinishTest {


    PlayerWhoDidNotFinish q;

    @BeforeEach
    void setUp() {
        q = new PlayerWhoDidNotFinish();
    }

    @Test
    void test() {
        assertEquals(new String("leo"), q.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }
}