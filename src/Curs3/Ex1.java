package Curs3;

import java.sql.SQLOutput;

public class Ex1 {
    private static void printCharNumber(String string){
        int maxOcc = 0;
        int maxCurrent = 0;
        string = string.toLowerCase();

        for ( int i = 0; i < string.length(); i++){
            maxCurrent = 1;
            if(Character.isWhitespace(string.charAt(i))){
                continue;
            }
            for (int j = i+1; j < string.length(); j++){
                if (string.charAt(i) == string.charAt(j)){
                    maxCurrent += 1;
                }
            }
            if (maxCurrent > maxOcc){
                maxOcc = maxCurrent;
            }
        }
        for (int i = 0; i<string.length(); i++){
            int occ = 1;
            if(Character.isWhitespace(string.charAt(i))){
                continue;
            }
            for (int j = i+1; j<string.length(); j++){
                if (string.charAt(i) == string.charAt(j)){
                    occ+=1;
                }
            }
            if (occ == maxOcc){
                System.out.println( "Character " + string.charAt(i) + " appears " + maxOcc + " times. " );
            }
        }

    }

    public static void main(String[] args) {
        printCharNumber("Becoming a programmer is like gaining super powers!");
    }
}