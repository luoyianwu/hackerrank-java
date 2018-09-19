package algorithms.implementation.organizingContainersOfBalls;

import java.util.Arrays;

public class Solution {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
        int row = container.length;
        int col = container.length;
        int[] rowSum = new int[row];
        int[] colSum = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowSum[i] += container[i][j];
                colSum[j] += container[i][j];
            }
        }
        Arrays.sort(rowSum);
        Arrays.sort(colSum);
        if (Arrays.equals(rowSum, colSum))
            return "Possible";
        else
            return "Impossible";
    }
}
