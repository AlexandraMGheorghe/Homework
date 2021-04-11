package Proiect3;

import java.util.*;

public class RadixSort {


    private Queue<String>[]queues = new ArrayDeque [10];
    private static Queue<String> sortedList;

    public static Queue<String> unsortedListWithZero(int [] unsortedList){
        int max = 0;
        int numberOfDigit = 0;

        Queue<String> unsortedListWithZero = new ArrayDeque<>();

        for (int number : unsortedList) {
            if (max < number) {
                max = number;
            }
        }

        while (max > 0) {
            numberOfDigit++;
            max /= 10;
        }

        for (int number : unsortedList) {
            unsortedListWithZero.offer(String.format("%0" + numberOfDigit + "d", number));
        }

        return unsortedListWithZero;

    }

    public static void radixSortAscending (int [] unsortedList) {
        Queue<String> zero = new LinkedList<>();
        Queue<String> unu = new LinkedList<>();
        Queue<String> doi = new LinkedList<>();
        Queue<String> trei = new LinkedList<>();
        Queue<String> patru = new LinkedList<>();
        Queue<String> cinci = new LinkedList<>();
        Queue<String> sase = new LinkedList<>();
        Queue<String> sapte = new LinkedList<>();
        Queue<String> opt = new LinkedList<>();
        Queue<String> noua = new LinkedList<>();
        sortedList = unsortedListWithZero(unsortedList);
        int lengthNumber = sortedList.peek().length();
        for (int i = lengthNumber - 1; i >= 0; i--) {
            while (!sortedList.isEmpty()) {
                int digit = (int) sortedList.peek().charAt(i);
                switch (digit) {
                    case 0:
                        zero.offer(String.valueOf(sortedList.poll()));
                    case 1:
                        unu.offer(String.valueOf(sortedList.poll()));
                    case 2:
                        doi.offer(String.valueOf(sortedList.poll()));
                    case 3:
                        trei.offer(String.valueOf(sortedList.poll()));
                    case 4:
                        patru.offer(String.valueOf(sortedList.poll()));
                    case 5:
                        cinci.offer(String.valueOf(sortedList.poll()));
                    case 6:
                        sase.offer(String.valueOf(sortedList.poll()));
                    case 7:
                        sapte.offer(String.valueOf(sortedList.poll()));
                    case 8:
                        opt.offer(String.valueOf(sortedList.poll()));
                    case 9:
                        noua.offer(String.valueOf(sortedList.poll()));
                }
            }
            while (!zero.isEmpty()) {sortedList.offer(zero.poll());}
            while (!unu.isEmpty()) {sortedList.offer(unu.poll());}
            while (!doi.isEmpty()) {sortedList.offer(doi.poll());}
            while (!trei.isEmpty()) {sortedList.offer(trei.poll());}
            while (!patru.isEmpty()) {sortedList.offer(patru.poll());}
            while (!cinci.isEmpty()) {sortedList.offer(cinci.poll());}
            while (!sase.isEmpty()) {sortedList.offer(sase.poll());}
            while (!sapte.isEmpty()) {sortedList.offer(sapte.poll());}
            while (!opt.isEmpty()) {sortedList.offer(opt.poll());}
            while (!noua.isEmpty()) {sortedList.offer(noua.poll());}
        }
        System.out.println(sortedList.toString());
    }
        public static void radixSortDescending (int [] unsortedList) {
            Deque<String> zero = new LinkedList<>();
            Deque<String> unu = new LinkedList<>();
            Deque<String> doi = new LinkedList<>();
            Deque<String> trei = new LinkedList<>();
            Deque<String> patru = new LinkedList<>();
            Deque<String> cinci = new LinkedList<>();
            Deque<String> sase = new LinkedList<>();
            Deque<String> sapte = new LinkedList<>();
            Deque<String> opt = new LinkedList<>();
            Deque<String> noua = new LinkedList<>();
            sortedList = unsortedListWithZero(unsortedList);
            int lengthNumber = sortedList.peek().length();
            for (int i = lengthNumber-1; i >= 0; i--){
                while (!sortedList.isEmpty()){
                    int digit = (int) sortedList.peek().charAt(i);
                    switch (digit){
                        case 0: zero.offer(String.valueOf(sortedList.poll()));
                        case 1: unu.offer(String.valueOf(sortedList.poll()));
                        case 2: doi.offer(String.valueOf(sortedList.poll()));
                        case 3: trei.offer(String.valueOf(sortedList.poll()));
                        case 4: patru.offer(String.valueOf(sortedList.poll()));
                        case 5: cinci.offer(String.valueOf(sortedList.poll()));
                        case 6: sase.offer(String.valueOf(sortedList.poll()));
                        case 7: sapte.offer(String.valueOf(sortedList.poll()));
                        case 8: opt.offer(String.valueOf(sortedList.poll()));
                        case 9: noua.offer(String.valueOf(sortedList.poll()));
                    }
                }
                while (!noua.isEmpty()){ sortedList.offer(noua.poll()); }
                while (!opt.isEmpty()){ sortedList.offer(opt.poll()); }
                while (!sapte.isEmpty()){ sortedList.offer(sapte.poll()); }
                while (!sase.isEmpty()){sortedList.offer(sase.poll()); }
                while (!cinci.isEmpty()){ sortedList.offer(cinci.poll());}
                while (!patru.isEmpty()){ sortedList.offer(patru.poll());}
                while (!trei.isEmpty()){sortedList.offer(trei.poll()); }
                while (!doi.isEmpty()){ sortedList.offer(doi.poll()); }
                while (!unu.isEmpty()){ sortedList.offer(unu.poll()); }
                while (!zero.isEmpty()){ sortedList.offer(zero.poll()); }
            }
            System.out.println(sortedList.toString());
    }

    public static void main(String[] args) {

            int[] unsortedList = {1000, 4, 25, 319, 88, 51, 3430, 8471, 701, 1, 2989, 657, 713};

            radixSortAscending(unsortedList);

           // radixSortDescending(unsortedList);
    }

    @Override
    public String toString() {
        return Arrays.toString(queues) ;
    }
}
