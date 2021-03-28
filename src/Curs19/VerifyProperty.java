package Curs19;

public class VerifyProperty {

    interface IVerifyProperty {
        boolean hasProperty(int a);
    }

    public static boolean isNegative (int a){
        if (a < 0){
            return true;
        }
        return false;
    }

    public static boolean isZero (int a){
        if (a == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        IVerifyProperty isEven = (x) ->  {
            if (x % 2  == 0){
                return true;
            }
            return false;
        };
        System.out.println(isEven.hasProperty(5));
        System.out.println();


        IVerifyProperty isNegative = VerifyProperty:: isNegative;
        System.out.println(isNegative.hasProperty(20));

        System.out.println();

        IVerifyProperty isZero = VerifyProperty:: isZero;
        System.out.println(isZero.hasProperty(0));

    }
}