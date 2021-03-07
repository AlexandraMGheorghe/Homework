package Curs14;

import java.util.Scanner;

public class Homework1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimensiunea matricei.");
        int matrixDimension = sc.nextInt();
        System.out.println("Elementele de pe diagonala principala.");
        int mainDiagValue = sc.nextInt();
        System.out.println("Elementele de pe diagonala secundara.");
        int sndDiagValue = sc.nextInt();
        System.out.println("Elementul de pe pozitia din centru a matricei");
        int centerValue = sc.nextInt();
        System.out.println("Elementele din „stanga“: cele aflate sub diagonala principala si deasupra diagonalei secundare");
        int leftValue = sc.nextInt();
        System.out.println("Elementele din „partea de sus“: cele aflate deasupra diagonalei principale si deasupra diagonalei secundare.");
        int upValue = sc.nextInt();
        System.out.println("Elementele din „dreapta“: cele aflate deasupra diagonalei principale si sub diagonala secundara.");
        int rightValue =  sc.nextInt();
        System.out.println("Elementele din „partea de jos“: cele aflate sub diagonala principala si sub diagonala secundara.");
        int bottomValue = sc.nextInt();
        sc.close();
        int [][] numbers = new int [matrixDimension][matrixDimension];
        for (int i = 0; i<numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j){
                    numbers[i][j] = mainDiagValue;
                }
                if (i+j == numbers.length-1){
                    numbers[i][j] = sndDiagValue;
                }
                if ((i == numbers.length/2) && (j == numbers.length/2)){
                    numbers[i][j]= centerValue;
                }
                if ((i>j) && (i+j<numbers.length-1)){
                    numbers[i][j] = leftValue;
                }
                if((i<j) && (i+j < numbers.length-1)){
                    numbers[i][j] = upValue;
                }
                if ((i < j) && (i+j> numbers.length-1)){
                    numbers[i][j] = rightValue;
                }
                if ((i>j) && (i+j> numbers.length-1)){
                    numbers[i][j] = bottomValue;
                }

            }
        }
        for(int k=0; k<numbers.length; k++) {
            for (int l = 0; l < numbers[k].length; l++) {
                System.out.print(numbers[k][l] + "\t");
            }
            System.out.println();
        }
    }
}
