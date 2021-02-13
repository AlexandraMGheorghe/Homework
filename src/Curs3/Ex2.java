package Curs3;

import java.util.Arrays;
import java.util.Locale;

public class Ex2 {

    public static boolean anagramSolver(String anag1, String anag2){
        String removeWhiteSpace = "";
        for (int i = 0; i < anag1.length(); i++){
            if (Character.isLetter(anag1.charAt(i))){
                removeWhiteSpace += anag1.charAt(i);
            }
        }
        String removeWhiteSpace2 = "";
        for (int i = 0; i < anag2.length(); i++) {
            if (Character.isLetter(anag2.charAt(i))) {
                removeWhiteSpace2 += anag2.charAt(i);
            }
        }
        removeWhiteSpace = removeWhiteSpace.toLowerCase();
        removeWhiteSpace2 = removeWhiteSpace2.toLowerCase();

        char[] array1 = removeWhiteSpace.toCharArray();
        char[] array2 = removeWhiteSpace2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
        }

    public static void main(String[] args) {
        System.out.println(anagramSolver("fairy tales!", "rail, safety"));
        System.out.println(anagramSolver("silver bullet", "sunny day"));
        System.out.println(anagramSolver("William Shakespeare", "I am a weakish speller!"));
    }
}

