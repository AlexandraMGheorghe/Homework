package Curs1;

public class Ex3aMultiply5 {
    public static int multiplyFive(int number){
        if ( number % 5 == 0 ){
            return number;
        }else{
            return (number - (number % 5));
        }
    }

    public static void main(String[] args) {
        System.out.println (multiplyFive(20));
        System.out.println (multiplyFive(18));
        System.out.println (multiplyFive(1));
        System.out.println (multiplyFive(4));
        System.out.println (multiplyFive(11));
    }
}
