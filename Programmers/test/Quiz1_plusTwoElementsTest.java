import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_plusTwoElementsTest {

    Quiz1_plusTwoElements q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_plusTwoElements();
    }

    @Test
    void 길이2일때(){
        assertArrayEquals(new int[]{3},q.solution(new int[]{1,2}));
    }
    @Test
    void test2(){
        assertArrayEquals(new int[]{2,3,4,5,6,7},q.solution(new int[]{2,1,3,4,1}));
    }
    @Test
    void test3(){
        assertArrayEquals(new int[]{2,5,7,9,12},q.solution(new int[]{5,0,2,7}));
    }
}