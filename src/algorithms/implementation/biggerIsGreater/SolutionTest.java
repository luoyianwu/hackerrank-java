package algorithms.implementation.biggerIsGreater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void biggerIsGreater() {
        Solution s = new Solution();
        assertEquals("no answer", s.biggerIsGreater("a"));
        assertEquals("ba", s.biggerIsGreater("ab"));
        assertEquals("no answer", s.biggerIsGreater("bb"));
        assertEquals("hegf", s.biggerIsGreater("hefg"));
        assertEquals("baab", s.biggerIsGreater("abba"));
        assertEquals("dhkc", s.biggerIsGreater("dhck"));
        assertEquals("hcdk", s.biggerIsGreater("dkhc"));

    }
}