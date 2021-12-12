import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz1_MakingWeirdWordTest {

    Quiz1_MakingWeirdWord q;

    @BeforeEach
    void setUp() {
        q = new Quiz1_MakingWeirdWord();
    }

    @Test
    void 한글자() {
        assertEquals("A", q.solution("a"));
    }

    @Test
    void 한단어() {
        assertEquals("TrY", q.solution("try"));
    }

    @Test
    void 세단어() {
        assertEquals("TrY HeLlO WoRlD", q.solution("try hello world"));
    }

    @Test
    void 한글자네단어() {
        assertEquals("Q W E R", q.solution("q W e r"));
    }

    @Test
    void 공백세번(){
        assertEquals("TrY     HeLlO  WoRlD", q.solution("try     hello  world"));
    }

    @Test
    void 마지막문자열공백(){
        assertEquals("TrY     HeLlO  WoRlD   ", q.solution("try     hello  world   "));
    }
}