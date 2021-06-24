package data_structure.day_four;

import java.util.*;

public class Q13 {
    public static HashMap<Integer, Integer> getSumPairs(int[] arr, int num) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            int completer = num - j;
            if (map.containsKey(completer)) {
                pairs.put(j, completer);
            }
            map.put(j, completer);
        }
        return pairs;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> pairs = getSumPairs(new int[]{5, 3, 9, 7, 2, 0, 6, 4, 1}, 5);
        System.out.println(Arrays.toString(new String[]{Arrays.toString(pairs.entrySet().toArray())}));
    }
}
