package data_structure.day_four;

public class Q16 {

    public static int superDigit(int number) {
        int sum = 0;
        while (true) {
            if (number < 10) {
                sum += number;
                break;
            }
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(superDigit(112005408));
    }
}
