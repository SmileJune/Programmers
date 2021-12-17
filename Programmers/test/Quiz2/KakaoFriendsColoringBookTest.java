package Quiz2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KakaoFriendsColoringBookTest {

    KakaoFriendsColoringBook q;

    @BeforeEach
    void beforeEach() {
        q = new KakaoFriendsColoringBook();
    }

    @Test
    void test1() {
        assertArrayEquals(new int[]{4, 5}, q.solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}}));
    }


}