package algorithms.strings.sherlockAndValidString;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution {
    // Complete the isValid function below.
    static String isValid(String s) {
        Map<Character, Integer> charFreq = new HashMap<>(0);
        Map<Integer, Integer> freqFreq = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            freqFreq.put(entry.getValue(), freqFreq.getOrDefault(entry.getValue(), 0) + 1);

        }
        if (freqFreq.size() > 2)
            return "NO";
        if (freqFreq.size() == 1) {
            return "YES";
        }
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        tree.putAll(freqFreq);
        if ((tree.firstKey() == tree.lastKey() - 1 && tree.lastEntry().getValue() == 1) || (tree.firstEntry().getValue() == 1))
            return "YES";
        return "NO";
    }
}
