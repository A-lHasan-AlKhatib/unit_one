package data_structure.day_four;

import java.util.HashMap;

public class Q12 {
    public static char countMaxChar(String s) {

        char maxChar = s.charAt(0);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(maxChar, 1);
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
            if (map.get(c) > map.get(maxChar))
                maxChar = c;
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(countMaxChar("test"));
    }
}
