package data_structure.day_four;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Q3 {

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {

        //  O(n log(n))
        Collections.sort(list);

        Iterator<Integer> iterator = list.iterator();

        int previous = iterator.next();

        while (iterator.hasNext()) {
            int current = iterator.next();
            if (previous == current)
                iterator.remove();
            else
                previous = current;
        }
        return list;
    }

    public static LinkedList<Integer> removeDuplicatesDoublePointers(LinkedList<Integer> list) {

        Iterator<Integer> iterator = list.iterator();

        int index = 1;
        while (iterator.hasNext()) {
            int current = iterator.next();
            Iterator<Integer> iterator2 = list.listIterator(index);
            while (iterator2.hasNext()) {
                int temp = iterator2.next();
                if (current == temp)
                    iterator2.remove();
            }
            index++;
        }

        return list;
    }


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        list.add(5);
//        list.add(3);
//        list.add(22);
//        list.add(0);

        System.out.println(Arrays.toString(removeDuplicates(list).toArray()));
        System.out.println(Arrays.toString(removeDuplicatesDoublePointers(list).toArray()));
    }
}
