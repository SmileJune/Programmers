import Quiz1.Quiz1_SortingStrings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_SortingStringsTest {

    Quiz1_SortingStrings q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_SortingStrings();
    }

    @Test
    void test1() {
        assertArrayEquals(new String[]{"car", "bed", "sun"}, q.solution(new String[]{"sun", "bed", "car"}, 1));
    }

    @Test
    void test2() {
        assertArrayEquals(new String[]{"abcd", "abce", "cdx"}, q.solution(new String[]{"abce", "abcd", "cdx"}, 2));
    }

}