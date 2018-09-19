package algorithms.implementation.organizingContainersOfBalls;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("Given normal input Then return correct result")
    void organizingContainers() {
        Solution s = new Solution();
        assertEquals("Possible", s.organizingContainers(new int[][] {{1, 1}, {1, 1}}));
        assertEquals("Impossible", s.organizingContainers(new int[][] {{0, 2}, {1, 1}}));
        assertEquals("Possible", s.organizingContainers(new int[][] {{1, 1, 3}, {1, 3, 1}, {3, 1, 1}}));
    }
}