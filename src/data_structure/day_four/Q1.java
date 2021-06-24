package data_structure.day_four;

import java.util.Arrays;
import java.util.Locale;

public class Q1 {
    public static boolean isAnagram(String word1, String word2) {

        if (word1 == null || word2 == null)
            return false;

        word1 = word1.toLowerCase(Locale.ROOT);
        word2 = word2.toLowerCase(Locale.ROOT);


        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        //sort complexity is O(n log(n)) as specified in the Arrays class.
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Hess", "ssEh"));
        System.out.println(isAnagram("Hess", "ssEhs"));
        System.out.println(isAnagram("Hess", "ksEh"));
        System.out.println(isAnagram("Hess", null));
        System.out.println(isAnagram("HSes", "HESS"));
        System.out.println(isAnagram("HESS", "HESS"));
    }
}
