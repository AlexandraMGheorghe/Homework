package Curs24;

public class Main {
    public static void main(String[] args) {
        MyStack <Integer> numbers = new MyStack<>();
        numbers.push(1);
        numbers.push(20);
        numbers.push(400);
        numbers.push(8);

        System.out.println(numbers.peek());
        System.out.println(numbers.pop());
        System.out.println(numbers.pop());
        System.out.println(numbers.peek());
    }
}
