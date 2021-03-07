package Curs14;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework1b {
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
        int n= matrixDimension, m = matrixDimension;
        ArrayList<ArrayList<Integer>> numbers;
        numbers = new ArrayList<ArrayList<Integer>>(n);
        for (int i=0; i<n; i++) {
            ArrayList<Integer> newRow = new ArrayList<Integer>(m); // new row
            for (int j=0; j<m; j++) {
                newRow.add(0);
            }
            numbers.add(newRow);
        }

        for (int i = 0; i<numbers.size(); i++){
            for (int j = 0; j < numbers.get(i).size(); j++) {
                if (i == j){
                    numbers.get(i).set(j, mainDiagValue);
                }
                if (i+j == n-1){
                    numbers.get(i).set(j, sndDiagValue);
                }
                if ((i == n/2) && (j == m/2)){
                    numbers.get(i).set(j,centerValue);
                }
                if ((i>j) && (i+j<m-1)){
                    numbers.get(i).set(j, leftValue);
                }
                if((i<j) && (i+j < n-1)){
                    numbers.get(i).set(j, upValue);
                }
                if ((i < j) && (i+j> n-1)){
                    numbers.get(i).set(j, rightValue);
                }
                if ((i>j) && (i+j> n-1)){
                    numbers.get(i).set(j, bottomValue);
                }
            }
        }
        for(int k=0; k<numbers.size(); k++) {
            for (int l = 0; l < numbers.get(k).size(); l++) {
                System.out.print(numbers.get(k).get(l) + "\t");
            }
            System.out.println();
        }
    }
}
