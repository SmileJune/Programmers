package Quiz2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz2_PrinterTest {

    Quiz2_Printer q;

    @BeforeEach
    void setUp() {
        q = new Quiz2_Printer();
    }

    @Test
    void test1() {
        assertEquals(1, q.solution(new int[]{2, 1, 3, 2}, 2));
    }

    @Test
    void test2() {
        assertEquals(5, q.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
