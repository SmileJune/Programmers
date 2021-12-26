package Quiz2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_MoreSpicyTest {

    Quiz1_MoreSpicy q;


    @BeforeEach
    void setUp() {
        q = new Quiz1_MoreSpicy();
    }

    @Test
    void test1() {
        assertEquals(2, q.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    @Test
    void test2() {
        assertEquals(-1, q.solution(new int[]{1, 2, 3}, 123890));
    }
}