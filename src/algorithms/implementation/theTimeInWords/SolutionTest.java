package algorithms.implementation.theTimeInWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void timeInWords() {
        Solution s = new Solution();
        assertEquals("five o' clock", s.timeInWords(5, 00));
        assertEquals("one minute past five", s.timeInWords(5, 01));
        assertEquals("quarter past five", s.timeInWords(5, 15));
        assertEquals("half past five", s.timeInWords(5, 30));
        assertEquals("twenty minutes to six", s.timeInWords(5, 40));
        assertEquals("quarter to six", s.timeInWords(5, 45));
        assertEquals("thirteen minutes to six", s.timeInWords(5, 47));
        assertEquals("twenty eight minutes past five", s.timeInWords(5, 28));
    }
}