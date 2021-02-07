package Curs5;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex0 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<String>(Arrays.asList("Mihai", "Cristina", "Laura", "Dean", "Alexandra"));
        //void add(int index, E element)
        names.add(0, "Alexandra");

        //boolean add(E element)
        names.add("Lucia");

        // int size()
        System.out.println(names);
        System.out.println(names.size());

        //boolean contains(Object o)
        System.out.println("Contains \"Alexandra\" : " + names.contains("Alexandra"));
        System.out.println("Contains \"Maria\" : " + names.contains("Maria"));

        //E get(int index)
        String lastName = names.get(names.size()-1);
        System.out.println("Last Name: " + lastName);

        //int indexOf(Object o)
        System.out.println("index of \"Alexandra\" : " + names.indexOf("Alexandra"));
        System.out.println("index of \"Lucy\" : " + names.indexOf("Lucy"));

        //int lastIndexOf(Object o)
        System.out.println("last index of \"Alexandra\" : " + names.lastIndexOf("Alexandra"));

        //boolean remove(Object o)
        System.out.println(names);
        names.remove("Laura");
        System.out.println(names);

        //E remove(int index)
        names.remove(3);
        System.out.println(names);

        //E set(int index, E element)
        names.set(4, "John");
        System.out.println(names);

        //void clear()
        names.clear();
        System.out.println(names);
    }
}
