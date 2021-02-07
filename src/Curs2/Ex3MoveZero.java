package Curs2;

public class Ex3MoveZero {
    private static void  moveZero1(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 1; i <= n - 1; i++) {
                if (arr[i] == 0) {
                    int aux = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = aux;
                    swapped = true;

                }

            }
        } while (swapped);

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 10, 0, 11, 1, 5, 0, 3, 8};
        moveZero1(arr);
    }
}


