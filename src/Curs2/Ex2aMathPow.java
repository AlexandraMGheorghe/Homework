package Curs2;

public class Ex2aMathPow {
    private static int myMathPowR (int x, int y){
        if ( y == 0) {
            return 1;
        }
        return x * myMathPowR(x, y-1);

    }

    public static void main(String[] args) {

        System.out.println(myMathPowR(2,6));
    }
}
