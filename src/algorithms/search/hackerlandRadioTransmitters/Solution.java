package algorithms.search.hackerlandRadioTransmitters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    // Complete the hackerlandRadioTransmitters function below.
    static int hackerlandRadioTransmitters(int[] input, int k) {
        List<Integer> x = Arrays.stream(input).boxed().collect(Collectors.toList());

        Collections.sort(x);
        int res = 0;

        for (int i = x.get(0); i <= x.get(x.size() - 1); i++) {
            if (x.contains(i)) {
                int nextTransmitter = i + k;
                while (nextTransmitter >= i) {
                    if (!x.contains(nextTransmitter)) {
                        nextTransmitter--;
                    } else
                        break;
                }
                i = nextTransmitter + k;
                res++;
            }
        }
        return res;
    }
}