package algorithms.sorting.countingSort4;

import java.util.*;

public class Solution {
    // Complete the countSort function below.
    static void countSort(List<List<String>> arr) {
        String[][] sorted = new String[100][1000000];
        int[] counts = new int[100];

        StringBuilder res = new StringBuilder();

        sortInput(arr, sorted, counts);
        appendResult(sorted, res);
        System.out.print(res.substring(0, res.length() - 1));
    }

    private static void sortInput(List<List<String>> arr, String[][] sorted, int[] counts) {
        for (int i = 0; i < arr.size(); i++) {
            List<String> strings = arr.get(i);
            int index = Integer.parseInt(strings.get(0));
            String toAdd = strings.get(1);
            if (i + 1 <= arr.size() / 2)
                toAdd = "-";
            sorted[index][counts[index]] = toAdd;
            counts[index]++;
        }
    }

    private static void appendResult(String[][] sorted, StringBuilder res) {
        for (String[] a: sorted) {
            for (String s: a) {
                if (s == null || s.isEmpty()) break;
                res.append(s);
                res.append(" ");
            }
        }
    }
}
