package Curs14;

import java.util.Random;

public class ExtraEx12 {
    private static final int dimensionLimit = 10;

    private static Random random = new Random();

    public static void main(String[] args) {

        int n = random.nextInt(dimensionLimit - 3) + 3,
                m = random.nextInt(dimensionLimit - 3) + 3;
        int[][] mat = new int[n][m];

        boolean upToDownDirection = false;
        int crtValue = 1;
        for (int j=0; j<m; j++) {
            upToDownDirection = !upToDownDirection;
            for (int i=0; i<n; i++) {
                if (upToDownDirection) {
                    mat[i][j] = crtValue;
                } else {
                    mat[n - i - 1][j] = crtValue;
                }
                crtValue++;
            }
        }

        System.out.println("The matrix is:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


