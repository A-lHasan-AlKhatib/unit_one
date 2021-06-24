package data_structure.day_four;

import java.util.Arrays;

public class Q7 {
    public static void sortTwoArrays(Integer[] a, Integer[] b) {
        int aNulls = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                aNulls = a.length - i;
                break;
            }
        }
        int i = aNulls - 1;
        int j = b.length - 1;
        int lastIndex = aNulls + b.length - 1;
        while (j >= 0) {
            if (i >= 0 && a[i] > b[j]) {
                a[lastIndex] = a[i];
                i--;
            } else {
                a[lastIndex] = b[j];
                j--;
            }
            lastIndex--;
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3, null, null, null};
        Integer[] b = new Integer[]{1, 2, 3};
        sortTwoArrays(a, b);

        System.out.println(Arrays.toString(a));
    }
}
