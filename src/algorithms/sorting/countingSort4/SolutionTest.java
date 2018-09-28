package algorithms.sorting.countingSort4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countSort() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        final Solution s = new Solution();
        final List<List<String>>input = new ArrayList<>();

        input.add(Arrays.asList(new String[]{"0", "a"}));
        input.add(Arrays.asList(new String[]{"1", "b"}));
        input.add(Arrays.asList(new String[]{"0", "c"}));
        input.add(Arrays.asList(new String[]{"1", "d"}));
        s.countSort(input);

        assertEquals("- c - d", outContent.toString());
    }
}