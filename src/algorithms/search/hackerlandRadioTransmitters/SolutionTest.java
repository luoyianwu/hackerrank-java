package algorithms.search.hackerlandRadioTransmitters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hackerlandRadioTransmitters() {
        Solution s = new Solution();
        assertEquals(1, s.hackerlandRadioTransmitters(new int[]{2}, 1));
        assertEquals(1, s.hackerlandRadioTransmitters(new int[]{2, 2}, 2));
        assertEquals(1, s.hackerlandRadioTransmitters(new int[]{2}, 3));
        assertEquals(2, s.hackerlandRadioTransmitters(new int[]{1, 3}, 1));
        assertEquals(2, s.hackerlandRadioTransmitters(new int[]{1, 4}, 2));
        assertEquals(2, s.hackerlandRadioTransmitters(new int[]{1, 2, 4}, 2));
        assertEquals(2, s.hackerlandRadioTransmitters(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(2, s.hackerlandRadioTransmitters(new int[]{1, 3, 4, 5}, 1));
        assertEquals(3, s.hackerlandRadioTransmitters(new int[]{2, 4, 5, 6, 7, 9, 11, 12}, 2));
        assertEquals(4, s.hackerlandRadioTransmitters(new int[]{9, 5, 4, 2, 6, 15, 12}, 2));
    }
}