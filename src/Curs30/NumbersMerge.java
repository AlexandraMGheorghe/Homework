package Curs30;

import java.io.*;
import java.util.Scanner;

public class NumbersMerge {
    public static void main(String[] args) throws IOException {

                try (Scanner sc = new Scanner(new BufferedReader(new FileReader("./src/Curs30/Number1.txt")));
                     Scanner sc2 = new Scanner(new BufferedReader(new FileReader("./src/Curs30/Number2.txt")));
                     BufferedWriter outputFile = new BufferedWriter(new FileWriter("./src/Curs30/NumbersMerge.txt"))) {

            int nums1 = 0;
            int nums2 = 0;

            if (!sc.hasNext()) {
                while (sc2.hasNext()) {
                    nums2 = Integer.parseInt(sc2.next().trim());
                    outputFile.write(nums2 + " ");
                }
            } else if (!sc2.hasNext()) {
                while (sc.hasNext()) {
                    nums1 = Integer.parseInt(sc.next().trim());
                    outputFile.write(nums1 + " ");
                }
            }
            boolean goNext1 = true;
            boolean goNext2 = true;

            while (sc.hasNext() && sc2.hasNext()) {
                if (goNext1) {
                    nums1 = Integer.parseInt(sc.next().trim());
                }
                if (goNext2) {
                    nums2 = Integer.parseInt(sc2.next().trim());
                }

                if (nums1 < nums2) {
                    outputFile.write(nums1 + " ");
                    goNext1 = true;
                    goNext2 = false;
                } else {
                    outputFile.write(nums2 + " ");
                    goNext2 = true;
                    goNext1 = false;
                }
            }

            while (sc.hasNext()) {
                nums1 = Integer.parseInt(sc.next().trim());

                if (nums2 < nums1) {
                    outputFile.write(nums2 + " ");
                    nums2 = Integer.MAX_VALUE;
                    outputFile.write(nums1 + " ");
                } else {
                    outputFile.write(nums1 + " ");
                    if (!sc.hasNext() && nums1 != Integer.MAX_VALUE) {
                        outputFile.write(nums2 + " ");
                    }
                }
            }

            while (sc2.hasNext()) {
                if (goNext1) {
                    outputFile.write(nums2 + " ");
                    nums1 = Integer.MAX_VALUE;
                }
                nums2 = Integer.parseInt(sc2.next().trim());
                if (nums1 < nums2) {
                    outputFile.write(nums1 + " ");
                    nums1 = Integer.MAX_VALUE;
                    outputFile.write(nums2 + " ");
                } else {
                    outputFile.write(nums2 + " ");
                    if (!sc2.hasNext() && nums1 != Integer.MAX_VALUE) {
                        outputFile.write(nums1 + " ");
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}