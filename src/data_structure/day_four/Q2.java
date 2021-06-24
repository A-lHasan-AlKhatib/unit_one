package data_structure.day_four;

import java.util.Arrays;

public class Q2 {

    public static int[] leftRotate(int[] arr, int rotates) {
        rotates = rotates % arr.length;
        int[] movedNums = new int[rotates];

        /*
        the below code equals

        for (int i = 0; i < movedNums.length; i++) {
            movedNums[i] = arr[i];
        }/
         */
        if (movedNums.length >= 0)
            System.arraycopy(arr, 0, movedNums, 0, movedNums.length);


        for (int i = rotates, j = 0; i < arr.length; i++, j++) {
            arr[j] = arr[i];
        }
        for (int i = arr.length - rotates, j = 0; i < arr.length; i++, j++) {
            arr[i] = movedNums[j];
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRotate(new int[]{1, 2, 3, 4, 5}, 1)));
        System.out.println(Arrays.toString(leftRotate(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(leftRotate(new int[]{1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(leftRotate(new int[]{1, 2, 3, 4, 5}, 8)));
    }
}
