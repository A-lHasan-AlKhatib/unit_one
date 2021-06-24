package data_structure.day_four;

public class Q10 {
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int nextMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                nextMax = max;
                max = i;

            } else if (i > nextMax)
                nextMax = i;
        }
        return nextMax;
    }

    public static void main(String[] args) {
        System.out.println(findSecondMax(new int[]{1101, 2, 3, 5, 3, 6, 2, 77, 9, 5, 3, 555}));
    }
}
