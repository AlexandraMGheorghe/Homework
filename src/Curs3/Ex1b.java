package Curs3;

public class Ex1b {
    private static void printCharNumber2(String string){
        int minOcc = string.length();
        int minCurrent = 0;
        string = string.toLowerCase();

        for ( int i = 0; i < string.length(); i++){
            minCurrent = 1;
            if(Character.isWhitespace(string.charAt(i))){
                continue;
            }
            for (int j = i+1; j < string.length(); j++){
                if (string.charAt(i) == string.charAt(j)){
                    minCurrent += 1;
                }
            }
            if (minCurrent < minOcc){
                minOcc = minCurrent;
            }
        }
        for (int i = 0; i < string.length(); i++){
            int occ = 0;
            if(Character.isWhitespace(string.charAt(i))){
                continue;
            }
            for (int j = 0; j < string.length(); j++){
                if (string.charAt(i) == string.charAt(j)){
                    occ += 1;
                }
            }
            if (occ == minOcc){
                System.out.println( "Character " + string.charAt(i) + " appears " + minOcc + " times. " );
            }
        }

    }

    public static void main(String[] args) {
        printCharNumber2("Becoming a programmer is like gaining super powers!");
    }
}
