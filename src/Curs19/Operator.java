package Curs19;

public class Operator {

    public interface IOperator {
        int operation(int a, int b);
    }

    public static int sum (int a, int b){
        System.out.println(a+b);
        return a+b;

    }

    public static int dif (int a, int b){
        System.out.println(a-b);
        return a-b;
    }

    public static int multiply (int a, int b){
        System.out.println(a*b);
        return a*b;
    }

    public static int div (int a, int b){
        System.out.println(a/b);
        return a/b;
    }

    public static int module (int a, int b) {
        System.out.println(a % b);
        return a%b;
    }



    public static void main(String[] args) {

        IOperator operator = Operator :: sum;
        operator.operation(20,5);

        IOperator operator2 = Operator :: dif;
        operator2.operation(20,5);

        IOperator operator3 = Operator :: multiply;
        operator3.operation(20,5);

        IOperator operator4 = Operator :: div;
        operator4.operation(20,5);

        IOperator operator5 = Operator :: module;
        operator5.operation(20,5);






    }
}
