package Curs30;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WriteStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = new LinkedList<>();

        String s = sc.nextLine();
        while (!s.equals("quit")) {
            words.add(s);
            s = sc.nextLine();
        }



        try (BufferedWriter out = new BufferedWriter(new FileWriter("./src/Curs30/result.txt"))) {

            out.write("Cuvintele introduse sunt:" + "\n");
            for ( String word: words){
            out.write(word + " ");
            }
            out.write("\n");
            out.write("1. Cel mai scurt cuvant: " + shortestWord(words) + "\n");
            out.write("2. Cel mai lung cuvant: " + longestWord(words) + "\n");
            out.write("3. Primul cuvant in ordine alfabetica: " + sortedAlph(words) + "\n");
            out.write("4. Ultimul cuvant in ordine alfabetica: " + sortedAlphLast(words) + "\n");
            out.write("5. Numarul total de cuvinte: " + numberOfWords(words) + "\n");

        } catch (NullPointerException e) {
            System.out.println("Nu ai scris nici un cuvant (in afara de 'quit')");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Something is wrong with the file.");
            e.printStackTrace();
        }

    }

   public static String shortestWord(List<String> list) throws NullPointerException {
        if (list == null || list.isEmpty()) {
            throw new NullPointerException();
        }
        int min = Integer.MAX_VALUE;
        String result = "";
        for (String s : list) {
            if (s.length() < min) {
                min = s.length();
                result = s;
            }
        }

        return result;
    }

    public static String longestWord(List<String> list) throws NullPointerException {
        if (list == null || list.isEmpty()) {
            throw new NullPointerException();
        }
        int max = Integer.MIN_VALUE;
        String result = "";
        for (String s : list) {
            if (s.length() > max) {
                max = s.length();
                result = s;
            }
        }

        return result;
    }

    public static String sortedAlph(List<String> list) throws NullPointerException {
        if (list == null || list.isEmpty()) {
            throw new NullPointerException();
        }
        Collections.sort(list);

        return list.get(0);
    }

    public static String sortedAlphLast (List<String> list) throws NullPointerException {
        if (list == null || list.isEmpty()) {
            throw new NullPointerException();
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static String numberOfWords(List<String> list) throws NullPointerException {
        if (list == null || list.isEmpty()) {
            throw new NullPointerException();
        }
        return String.valueOf(list.size());
    }
}
