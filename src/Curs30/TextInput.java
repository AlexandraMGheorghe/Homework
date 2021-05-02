package Curs30;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextInput {
    private static String [] getData(){
        String [] text = {};
        return text;

    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul cuvant");
        String first = sc.next();
        System.out.println("Introduceti al doilea cuvant");
        String second = sc.next();
        sc.close();

        List<String> list = new ArrayList<String>();

        try (Scanner sc2 = new Scanner(new BufferedReader(new FileReader("./src/Curs30/TextInput.txt")))) {
            while (sc2.hasNext()) {
                String word = sc2.nextLine();

                list.add(word);
            }
        }

        // textProcessing
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(first)) {
                list.set(i,list.get(i).replaceAll(first,second));
            }
        }


        // writeInFile
        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("./src/Curs30/TextInput.txt"))){
            for (String newString : list) {
                outputFile.write(newString);
                outputFile.newLine();
            }
        }
    }
}


