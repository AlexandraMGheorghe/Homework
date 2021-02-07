package Curs2;

public class Ex2bMathPow {
    private static int myMathpowR (int x, int y){
        int result = 1;
        for (int i = 1; i <= y; i++ ){
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myMathpowR(2,6));
    }
}

