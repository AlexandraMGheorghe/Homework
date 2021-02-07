package Curs2;

public class Ex1aReverseNumber {
    public static int reverseNumberR(int number){
        if (number < 10){
            return number;
        }

        int reverse = reverseNumberR(number / 10);

        int mul;

        for(mul = 1 ; mul <= number/10; mul *=10 );

        return (number % 10) * mul + reverse;
    }

    private static int recursiveReverse (int n){
        if (n <= 10){
            return n;
        }
        String lastDigit = String.valueOf(n%10);
        return Integer.parseInt(lastDigit+recursiveReverse(n/10));
    }
    public static void main(String[] args) {
        System.out.println(reverseNumberR(4321));
    }
}
