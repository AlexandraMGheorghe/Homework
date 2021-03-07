package Curs14;

import java.util.Random;
import java.util.stream.Stream;

public class ExtraEx11 {
        private static final int dimensionLimit = 10;

        private static Random random = new Random();

        public static void main (String[]args){

            int n = random.nextInt(dimensionLimit - 3) + 3,
                    m = random.nextInt(dimensionLimit - 3) + 3;
            int[][] mat = new int[n][m];

            boolean upToDownDirection = false;
            int crtValue = m*n;

            for (int i = 0; i < n; i++) {
                upToDownDirection = !upToDownDirection;
               for (int j = m-1; j >=0 ; j--) {
                   if (upToDownDirection) {
                       mat[i][j] = crtValue;
                   }else{
                       mat[i][m-j-1] = crtValue;
                   }
                   crtValue--;
               }
            }


            System.out.println("The matrix is:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }



