package algorithms.implementation.encryption;

public class Solution {
    // Complete the encryption function below.
    static String encryption(String s) {
        StringBuilder res = new StringBuilder();
        s = s.replace(" ", "");

        int col = (int) Math.ceil(Math.pow(s.length(), 0.5));
        int row = (int) Math.ceil((double)s.length() / col);

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                int index = col * j + i;
                if (index >= s.length())
                    break;
                res.append(s.charAt(index));
            }
            res.append(" ");
        }

        return res.toString().substring(0, res.length() - 1);
    }
}
