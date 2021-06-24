package data_structure.day_four;

import java.util.Arrays;

public class Q7 {

    public static void sortTwoArrays(Integer[] a, Integer[] b) {
        int lastA = 0;
        int lastB = b.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                lastA = a.length - i;
                break;
            }
        }

        int indexMerged = lastB + lastA - 1; // Index of last location of merged array
        int indexA = lastA - 1;
        int indexB = lastB - 1;

        //start form the end of the arrays
        while (indexB >= 0) {
            if (indexA >= 0 && a[indexA] >= b[indexB]) {
                a[indexMerged] = a[indexA];
                indexA--;
            } else {
                a[indexMerged] = b[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }


    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3, null, null, null};
        Integer[] b = new Integer[]{1, 2, 3};
        sortTwoArrays(a, b);

        System.out.println(Arrays.toString(a));
    }
}
