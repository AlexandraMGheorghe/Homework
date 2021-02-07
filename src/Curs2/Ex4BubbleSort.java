package Curs2;

import java.util.Arrays;

public class Ex4BubbleSort {
    private static double[] bubbleSort(double[] values) {
        int n = values.length;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 1; i <= n - 1; i++) {
                if (values[i] < values[i - 1]) {
                    double aux = values[i];
                    values[i] = values[i - 1];
                    values[i - 1] = aux;
                    swapped = true;
                }
            }
        } while (swapped);
        return values;
    }

    public static void displayArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSortDouble(double[] numbers) {
        int n = numbers.length;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                int jMin = i;
                for (int j = i + 1; j < n; j++) {
                    if (numbers[j] < numbers[jMin]) {
                        jMin = j;
                    }
                }
                if (jMin != i) {
                    double aux = numbers[i];
                    numbers[i] = numbers[jMin];
                    numbers[jMin] = aux;
                }
            }

        } while (swapped);
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ", ");
        }
        System.out.println();
    }

    public static void selectionSortdesc(double[] numbers) {
        int n = numbers.length;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                int jMax = i;
                for (int j = i + 1; j < n; j++) {
                    if (numbers[j] > numbers[jMax]) {
                        jMax = j;
                    }
                }
                if (jMax != i) {
                    double aux = numbers[i];
                    numbers[i] = numbers[jMax];
                    numbers[jMax] = aux;
                }
            }

        } while (swapped);
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ", ");
        }
        System.out.println();
    }
    public static void sortArray(double[] numbers) {
        Arrays.sort( numbers );
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ", ");
        }
        System.out.println();
    }
    public static void sortArrayDesc(double[] numbers) {
        Arrays.sort( numbers );

        for (int j = 0; j < numbers.length/2; j++) {
            double aux = numbers[j];
            numbers[j] = numbers[numbers.length - j - 1];
            numbers[numbers.length - j - 1] = aux;
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j]+ ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        double[] numbers = new double[]{15.1, 1.2, 257.30, 11.050, 924.98};
        displayArray(bubbleSort(numbers));
        selectionSortDouble(numbers);
        long startTime1 = System.nanoTime();
        selectionSortdesc(numbers);
        long endTime1 = System.nanoTime();
        double duration1 = (endTime1-startTime1)/ 1000_000_000d;
        System.out.println(duration1);
        sortArray(numbers);
        long startTime = System.nanoTime();
        sortArrayDesc(numbers);
        long endTime = System.nanoTime();
        double duration = (endTime-startTime)/ 1000_000_000d;
        System.out.println(duration);
    }
}

