package data_structure.day_four;

public class Q14 {
    public static int findDifference(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i - 1];
        }

        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[][]{
                {12, 0, 7},
                {20, -1, 6},
                {3, 4, 5}
        }));
    }
}
