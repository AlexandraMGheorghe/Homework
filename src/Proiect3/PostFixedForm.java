package Proiect3;

import java.util.*;

public class PostFixedForm {


    public static Queue<String> postFixedForm() {

        Queue<String> postFixedForm = new ArrayDeque<>();
        Deque<String> stack = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        while (!expression.isEmpty()) {
            expression = sc.nextLine();

            if (Character.isDigit(expression.charAt(0))) {
                postFixedForm.add(expression);
                if (expression.equals("+") || expression.equals("-") || (expression.equals("/") ||
                        expression.equals("*") || expression.equals("^"))) {
                    while ((!stack.isEmpty())
                            && (!stack.peek().equals("("))
                            && operatorPrecedence(expression) < operatorPrecedence(stack.peek())
                            || operatorPrecedence(expression) == operatorPrecedence(stack.peek())
                            && operatorAssociativity(stack.peek()).equals("stanga-dreapta")) {

                        postFixedForm.add(stack.pop());
                    }
                    stack.add(expression);
                }

                if (expression.equals(("("))) {
                    stack.add(expression);
                }

                if (expression.equals((")"))) {
                    boolean found = false;
                    while (!stack.peek().equals("(") || !stack.isEmpty()) {
                        postFixedForm.add(stack.pop());
                        if (stack.peek().equals("(")) {
                            found = true;
                        }
                    }
                    if (stack.isEmpty() && !found) {
                        System.out.println(" Expresia avea paranteze gresite ");
                    }
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek().equals("(")) {
                System.out.println("Expersia avea paranteze gresite");
                break;
            } else {
                postFixedForm.add(stack.pop());
            }
        }
        System.out.println(postFixedForm.toString());
        return postFixedForm;
    }

    private static int operatorPrecedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 11;
            case "*":
            case "/":
                return 12;
            case "^":
                return 13;
            default:
                throw new IllegalArgumentException("Operator gresit");
        }
    }

    private static String operatorAssociativity(String operator) {
        switch (operator) {
            case "+":
            case "-":
            case "*":
            case "/":
                return "stanga-dreapta";
            case "^":
                return "dreapta-stanga";
            default:
                throw new IllegalArgumentException("Operator gresit");
        }
    }

}

