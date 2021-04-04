package Curs22;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;

public class RemoveDuplicate2 {
    public static void removeDuplicates(LinkedList<Integer> list) {
        ListIterator<Integer> it = list.listIterator();

        int aux1 = it.next();
        int aux2 = it.next();

        while (it.hasNext()) {

            if (aux1 == aux2) {
                it.remove();
            } else {
                aux1 = aux2;
            }
            aux2 = it.next();
        }
        if (aux1 == aux2) {
            it.remove();
        }
    }

    public static void print (LinkedList<Integer>list){
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
            System.out.print( it.next()+ " ");
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(9);
        numbers.add(9);
        numbers.add(10);

        print(numbers);
        System.out.println();
        removeDuplicates(numbers);
        print(numbers);
           }

}
