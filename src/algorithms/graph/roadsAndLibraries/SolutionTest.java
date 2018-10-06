package algorithms.graph.roadsAndLibraries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void roadsAndLibrariesWithNoEdge() {
        Solution s = new Solution();
        assertEquals(2, s.roadsAndLibraries(1, 2, 1, new int[][]{}));
        assertEquals(4, s.roadsAndLibraries(2, 2, 1, new int[][]{}));
    }

    @Test
    void roadsAndLibrariesWithSeperateParts() {
        Solution s = new Solution();
        assertEquals(8, s.roadsAndLibraries(6, 2, 1, new int[][]{{1, 2}, {1, 3}, {3, 4}, {5, 6}}));
    }

    @Test
    void roadsAndLibrariesWhereRoadsAreCheaper() {
        Solution s = new Solution();
        assertEquals(4, s.roadsAndLibraries(3, 2, 1, new int[][]{{1, 2}, {3, 1}, {2, 3}}));
        assertEquals(4, s.roadsAndLibraries(4, 2, 1, new int[][]{{1, 2}, {1, 3}, {1, 4}}));
    }

    @Test
    void roadsAndLibrariesWhereLibrariesAreCheaper() {
        Solution s = new Solution();
        assertEquals(12, s.roadsAndLibraries(6, 2, 5, new int[][]{{1, 3}, {3, 4}, {2, 4}, {1, 2}, {2, 3}, {5, 6}}));
    }
}