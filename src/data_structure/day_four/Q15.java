package data_structure.day_four;

public class Q15 {
    public static int countMaxCandles(int[] candles) {
        int max = candles[0];
        int count = 0;
        for (int i = 1; i < candles.length; i++) {
            if (candles[i] > max) {
                max = candles[i];
                count = 1;
            } else if (candles[i] == max)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countMaxCandles(new int[]{1111,1,2,2,33,33,5,7,33,55,33,555}));
    }
}
