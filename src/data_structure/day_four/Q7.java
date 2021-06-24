package data_structure.day_four;

import java.util.ArrayList;

public class Q7 {
    public static void sortTwoArrays(Integer[] a, Integer[] b) {
        int nonEmptyInA = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                nonEmptyInA = a.length - i;
                break;
            }
        }
        System.out.println(nonEmptyInA);
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,2,3,null,null,null};
        Integer[] b = new Integer[]{1,2,3};
        sortTwoArrays(a,b);
    }
}
