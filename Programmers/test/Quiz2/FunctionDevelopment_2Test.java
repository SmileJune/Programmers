package Quiz2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionDevelopment_2Test {

    FunctionDevelopment q;

    @BeforeEach
    void setUp() {
        q = new FunctionDevelopment();
    }

    @Test
    void test1() {
        assertArrayEquals(new int[]{2, 1}, q.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{1, 3, 2}, q.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
    }
}