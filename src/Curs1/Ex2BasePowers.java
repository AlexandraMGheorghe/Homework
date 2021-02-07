package Curs1;

import java.util.Scanner;

public class Ex2BasePowers {
    public static final Scanner inputScanner = new Scanner(System.in);

    public static int readNumberFromInput (String message){
        if (message == null) {
            System.out.println("Please insert the number (and press Enter):");
        } else {
            System.out.println(message + " (and press Enter):");
        }
        return inputScanner.nextInt();
    }

    public static void printBasePowers (int b, int e){
        if  (e < 0){
            System.out.println ("Error: the exponent should be pozitive.");
            return;
        }

        for (int i = 0; i<= e; i++){
            System.out.print( (int) Math.pow(b,i) + " ");
        }
    }

    public static void main(String[] args) {
        int b = readNumberFromInput("Please insert the base");
        int e = readNumberFromInput("Please insert the exponent");
        printBasePowers(b, e);


        inputScanner.close();

    }
}
