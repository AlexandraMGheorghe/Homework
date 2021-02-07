package Curs5;

import java.util.ArrayList;

public class Ex1 {
    private static void printCharNumber(String string){

        ArrayList<Character> occ = new ArrayList<>();

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
                occ.clear();
                occ.add(string.charAt(i));
            }else if (maxCurrent == maxOcc){
                occ.add(string.charAt(i));
            }
        }
        System.out.println("Maximum number of occurrences " + maxOcc);
        System.out.print("Characters with maximum number of occurrences : ");
        System.out.println(occ);
    }

    public static void main(String[] args) {
        printCharNumber("Becoming a programmer is like gaining super powers!");
    }
}

