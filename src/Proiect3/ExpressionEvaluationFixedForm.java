package Proiect3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ExpressionEvaluationFixedForm {
    public static int postFixEval(){
        Deque <Integer> stackOperation = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        int op1 = 0, op2 = 0, rezultat = 0;
        while (!(expression= sc.nextLine()).isEmpty()) {


            if (Character.isDigit(expression.charAt(0))) {
                stackOperation.push(Integer.valueOf(expression));
            }else if (expression.equals("+") || expression.equals("-") || (expression.equals("/") ||
                    expression.equals("*") || expression.equals("^"))) {
                if (stackOperation.size() > 1) {
                    op1 = stackOperation.pop();
                    op2 = stackOperation.pop();
                    switch (expression) {
                        case "+":
                            stackOperation.push( (op1 + op2));
                        case "-":
                            stackOperation.push( (op1 - op2));
                        case "/":
                            stackOperation.push( (op1 / op2));
                        case "*":
                            stackOperation.push((op1 * op2));
                        case "^":
                            stackOperation.push( (int) Math.pow(op1,op2));
                    }
                } else {
                    System.out.println("expresia postfixata este gresita");
                }
            }
        }
        rezultat= stackOperation.pop();
        System.out.println(rezultat);
        if (!stackOperation.isEmpty()) {
            System.out.println("Expresia postfixata este gresita");
        }
        return rezultat;

    }


}
