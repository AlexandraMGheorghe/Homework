package Curs1;

import java.util.Scanner;

public class Ex5PrimeNumbers {
    private static final Scanner inputScanner = new Scanner(System.in);

    public static int readNumberFromInput(String message) {
        if (message == null) {
            System.out.println("Please insert the number (and press Enter):");
        } else {
            System.out.println(message + " (and press Enter):");
        }
        return inputScanner.nextInt();
    }

}
