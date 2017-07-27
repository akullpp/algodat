package de.akull.ctci;

public class ZeroMatrix_1_8 {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] rows = new boolean[n];
        boolean[] columns = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) {
                matrix[i] = new int[n];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (columns[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
