package de.akull.ds.ctci;

public class RotateMatrix_1_7 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
//              {7, 4, 1},
//              {8, 5, 2},
//              {9, 6, 3}
        };
        int n = matrix.length;

        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = matrix[i][j];
            }
        }
    }
}
