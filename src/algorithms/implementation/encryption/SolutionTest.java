package algorithms.implementation.encryption;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void encryption() {
        Solution s = new Solution();

        assertEquals("hae and via ecy", s.encryption("haveaniceday"));
        assertEquals("hae and via ecy", s.encryption("hav ean ice day"));
        assertEquals("fto ehg ee dd", s.encryption("feedthedog"));
        assertEquals("clu hlt io", s.encryption("chillout"));
    }
}