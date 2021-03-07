package Curs14;
import java.util.Random;
public class Homework2 {
    private static final Random random = new Random();
    private static void sum(int[][] numbers , int[][]numbers2){
        int n = numbers.length;
        int[][] sum = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sum[i][j] = numbers[i][j] + numbers2[i][j];
            }
        }

        System.out.println("The result of sum matrix is:");
        for (int k=0; k<n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(sum[k][l] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void decrease(int[][] numbers , int[][]numbers2){
        int n = numbers.length;
        int[][] decreases = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                decreases[i][j] = numbers[i][j] - numbers2[i][j];
            }
        }

        System.out.println("The result of decreases matrix is:");
        for (int k=0; k<n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(decreases[k][l] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void multiplyingWithNumber(int[][] numbers , int value) {
        int n = numbers.length;
        int[][] multiplyingWithNumber = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                multiplyingWithNumber[i][j] = numbers[i][j] * value;
            }
        }
        System.out.println("The result of multiplying With Number matrix is:");
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(multiplyingWithNumber[k][l] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void multiply(int[][] numbers , int[][]numbers2) {
        int n = numbers.length;
        int[][] multiply = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                multiply[i][j] = 0 ;
                for (int a=0; a<n; a++){
                    multiply[i][j] += numbers[i][a]* numbers2[a][j];
                }
            }
        }
        System.out.println("The result of multiplying  matrix is:");
        for (int k=0; k<n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(multiply[k][l] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int valueLimit = 100;
        int[][] numbers = new int[n][n];
        int[][] numbers2 = new int[n][n];
        int value = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = random.nextInt(valueLimit);
            }
        }
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                numbers2[k][l] = random.nextInt(valueLimit);
            }
        }

        System.out.println("The first matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The second matrix is:");
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(numbers2[k][l] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        sum(numbers, numbers2);
        decrease(numbers, numbers2);
        multiplyingWithNumber(numbers, value);
        multiply(numbers, numbers2);
    }
}