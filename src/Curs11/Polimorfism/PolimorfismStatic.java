package Curs11;

public class PolimorfismStatic{
    public static void printSomething (String something){
        System.out.println(something);
    }

    public static void printSomething (int number){
        System.out.println(number);
    }

    public static void printSomething (double number){
        System.out.println(number);
    }

    public static void main(String[] args) {
        printSomething("something");
        printSomething(25);
        printSomething(28.3);
    }
}
