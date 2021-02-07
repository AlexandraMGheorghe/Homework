package Curs1;

import java.util.Scanner;

public class Ex1Complementar {
    private static final Scanner inputScanner =  new Scanner(System.in);

    public static int readNumberFromInput(String message){
        if (message == null){
            System.out.println ( " Please insert the number (and press Enter) : " );
        }else {
            System.out.println(message + " (and press Enter):");
        }
        return inputScanner.nextInt();
    }

    public static int getComplementaryNumber (int n){
        int numberRound = 1;
        while (numberRound < n) {
            numberRound *= 10;
        }
        return (numberRound - n);
    }
    public static void main(String[] args) {
        int number = readNumberFromInput(null);
        int complementaryNumber = getComplementaryNumber(number);

        System.out.println(number + " complementary is: " + complementaryNumber);

        inputScanner.close();
    }
}