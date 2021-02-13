package Curs3;

import java.util.Arrays;

public class Ex4 {
    public static void lettersMatchIgnoreCase(String[] array, String key, int matchKey) {
        key = key.toLowerCase();
        int counter = 0;
        String[] array2 = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String word = array[i].toLowerCase();
            boolean founded = false;
            int countMatches = 0;

            char[] charWords = word.toCharArray();
            char[] charKey = key.toCharArray();

            if (charWords.length > charKey.length) {
                for (int j = 0; j < charKey.length; j++) {
                    if (charWords[j] == charKey[j]) {
                        founded = true;
                        countMatches+=1;
                    }
                }

            } else {
                for (int k = 0; k < charWords.length; k++) {
                    if (charWords[k] == charKey[k]) {
                        founded = true;
                        countMatches += 1;
                    }
                }
            }
            if (founded && countMatches >= matchKey) {
                array2[counter] = array[i];
                counter += 1;
            }
        }

        String[] arrayFinal = Arrays.copyOf(array2, counter);

        for (int i = 0; i < counter; i++) {
            System.out.print(arrayFinal[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[]args) {
        String[] array = new String[] { "clothes", "ant", "drop", "Fly", "racoon", "class", "Plane" };
        String key = "plot";
        int matchKey = 1;

        lettersMatchIgnoreCase(array, key, matchKey);

        String[] array2 = new String[] {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
        String key2 = "plot";
        int matchKey2 = 2;

        lettersMatchIgnoreCase(array2, key2, matchKey2);

        String[] array3 = new String[] {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
        String key3 = "plot";
        int matchKey3 = 3;

        lettersMatchIgnoreCase(array3, key3, matchKey3);

    }
}
