import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_ponketmonTest {

    Quiz1_ponketmon q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_ponketmon();
    }

    @Test
    void test1(){
        assertEquals(2,q.solution(new int[]{3,1,2,3}));
    }

    @Test
    void test2(){
        assertEquals(3,q.solution(new int[]{3,3,3,2,2,4}));
    }

    @Test
    void test3(){
        assertEquals(2,q.solution(new int[]{3,3,3,2,2,2}));
    }
}