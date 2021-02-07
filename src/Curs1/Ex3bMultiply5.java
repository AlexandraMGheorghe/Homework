package Curs1;

public class Ex3bMultiply5 {
    public static int multiplyFiveUpper(int number){
        if ( number % 5 == 0 ){
            return number;
        }else{
            return (number + 5 - (number % 5));
        }
    }

    public static void main(String[] args) {
        System.out.println (multiplyFiveUpper(20));
        System.out.println (multiplyFiveUpper(18));
        System.out.println (multiplyFiveUpper(1));
        System.out.println (multiplyFiveUpper(4));
        System.out.println (multiplyFiveUpper(11));
    }
}

