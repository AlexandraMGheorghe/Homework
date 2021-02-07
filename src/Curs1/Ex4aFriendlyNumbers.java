package Curs1;

import java.util.Scanner;

public class Ex4aFriendlyNumbers {
    public static int possibleFriendlyNumbers (int x){
        int sum = 0 ;
        for (int i = 1 ; i <= x / 2; i++ ){
            if ( x % i == 0){
                sum += i;
            }
        }
        return (sum);
    }

    public static boolean areFriendlyNumbers (int x, int y){
        int possibleFriendlyNumbersOfX = possibleFriendlyNumbers(x);
        int possibleFriendlyNumbersOfY = possibleFriendlyNumbers(y);
        if (possibleFriendlyNumbersOfX == y && possibleFriendlyNumbersOfY == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//       System.out.println(areFriendlyNumbers(220, 284));
//       System.out.println(areFriendlyNumbers(1184, 1210));
//       System.out.println(areFriendlyNumbers(2620, 2924));
//       System.out.println(areFriendlyNumbers(5020, 5564));
//       System.out.println(areFriendlyNumbers(6232, 6368));
        Scanner sc = new Scanner(System.in);
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();
        sc.close();

        for(int i = lowerLimit; i <= upperLimit; i++) {
            for(int j = i+1; j <= upperLimit; j++) {
                if (areFriendlyNumbers(i, j)) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
