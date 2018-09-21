package algorithms.implementation.theTimeInWords;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Solution {
    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String minute;
        String preposition;
        String hour;
        Map<Integer, String> numbers = buildNumbers();

        minute = getMinute(numbers, m);
        preposition = getPreposition(m);
        hour = getHour(numbers, h, m);
        return Stream.of(minute, preposition, hour)
                .filter(s -> s != null && !s.isEmpty())
                .collect(joining(" "));
    }

    private static String getMinute(Map<Integer, String> numbers, int m) {
        String res = "";
        int realM = m;
        if (realM > 30) realM = 60 - realM;

        if (realM == 0) return res;

        res = numbers.get(realM);
        if (realM != 15 && realM != 30) {
            res = res.concat(" minute");
            if (realM != 1) {
                res = res.concat("s");
            }
        }
        return res;
    }

    private static String getPreposition(int m) {
        if (m > 0 && m <= 30) return "past";
        if (m > 30 && m <= 59) return "to";
        return "";
    }

    private static String getHour(Map<Integer, String> numbers, int h, int m) {
        String res;
        if (m <= 30) {
            res = numbers.get(h);
            if (m == 0)
                res = res.concat(" o' clock");
        }
        else
            res = numbers.get(h + 1);
        return res;
    }

    private static Map<Integer, String> buildNumbers() {
        Map<Integer, String> res = new HashMap<>();
        res.put(1, "one");
        res.put(2, "two");
        res.put(3, "three");
        res.put(4, "four");
        res.put(5, "five");
        res.put(6, "six");
        res.put(7, "seven");
        res.put(8, "eight");
        res.put(9, "nine");
        res.put(10, "ten");
        res.put(11, "eleven");
        res.put(12, "twelve");
        res.put(13, "thirteen");
        res.put(14, "fourteen");
        res.put(15, "quarter");
        res.put(16, "sixteen");
        res.put(17, "seventeen");
        res.put(18, "eighteen");
        res.put(19, "nineteen");
        res.put(20, "twenty");
        res.put(21, "twenty one");
        res.put(22, "twenty two");
        res.put(23, "twenty three");
        res.put(24, "twenty four");
        res.put(25, "twenty five");
        res.put(26, "twenty six");
        res.put(27, "twenty seven");
        res.put(28, "twenty eight");
        res.put(29, "twenty nine");
        res.put(30, "half");
        return res;
    }
}
