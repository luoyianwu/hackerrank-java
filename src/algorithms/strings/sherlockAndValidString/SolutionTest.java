package algorithms.strings.sherlockAndValidString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid() {
        Solution s = new Solution();
        assertEquals("YES", s.isValid("aabbc"));
        assertEquals("YES", s.isValid("abcdefghhgfedecba"));
        assertEquals("NO", s.isValid("aabbcd"));
        assertEquals("NO", s.isValid("aabbccddeefghi"));
    }
}