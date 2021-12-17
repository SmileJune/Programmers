package excluded;

import excluded.Quiz1_NewIdRecommendation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Quiz1_NewIdRecommendationTest {
    Quiz1_NewIdRecommendation q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_NewIdRecommendation();
    }

    @Test
    void test1() {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String result = "bat.y.abcdefghi";
        Assertions.assertEquals(result, q.solution(new_id));
    }

    @Test
    void test2() {
        String new_id = "z-+.^.";
        String result = "z--";
        Assertions.assertEquals(result, q.solution(new_id));
    }

    @Test
    void test3() {
        String new_id = "=.=";
        String result = "aaa";
        Assertions.assertEquals(result, q.solution(new_id));
    }

    @Test
    void test4() {
        String new_id = "123_.def";
        String result = "123_.def";
        Assertions.assertEquals(result, q.solution(new_id));
    }

    @Test
    void test5() {
        String new_id = "abcdefghijklmn.p";
        String result = "abcdefghijklmn";
        Assertions.assertEquals(result, q.solution(new_id));
    }

}