package Curs23;

import java.util.ArrayDeque;
import java.util.Deque;

public class EX1 {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s = "()[]({})";
        String s2 = "(((([{}]))))[]";
        String s3 = "()[([{}])]";
        String s4 = "()(([])){[[()]]}";
        String s5 = "[[]";
        String s6 = "[[]])";
        String s7 = "[[(]])";
        String s8 = "[(])";

        System.out.println(s +" is valid: " + isValid(s));
        System.out.println(s2 +" is valid: " + isValid(s2));
        System.out.println(s3 +" is valid: " + isValid(s3));
        System.out.println(s4 +" is valid: " + isValid(s4));
        System.out.println(s5 +" is valid: " + isValid(s5));
        System.out.println(s6 +" is valid: " + isValid(s6));
        System.out.println(s7 +" is valid: " + isValid(s7));
        System.out.println(s8 +" is valid: " + isValid(s8));
    }
}
