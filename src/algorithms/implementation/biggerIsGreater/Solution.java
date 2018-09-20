package algorithms.implementation.biggerIsGreater;

public class Solution {
    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        if (w.length() < 2)
            return "no answer";
        String res = "no answer";

        for (int i = w.length() - 2; i >= 0; i--) {
            if (w.charAt(i) < w.charAt(i + 1)) {
                String head = i == 0 ? "" : w.substring(0, i);
                res = head.concat(swapAndReverse(w.substring(i)));
                break;
            }
        }
        return res;
    }

    static public String swapAndReverse(String w) {
        StringBuilder res = new StringBuilder();
        char firstLetter = w.charAt(0);
        for (int i = w.length() - 1; i >= 0; i--) {
            if (w.charAt(i) > firstLetter) {
                res.append(w, 1, i);
                res.append(firstLetter);
                res.append(w.substring(i + 1));
                res = res.reverse();
                res = res.insert(0, w.charAt(i));
                break;
            }
        }
        return res.toString();
    }
}
