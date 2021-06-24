package data_structure.day_four;

public class Q8 {
    public static void sortOddEvenNodes(Q4.Node<Integer> head) {
        Q4.Node<Integer> firstSet, secondSet, secondSetHead;
        if (head == null || head.next == null) {
            return;
        } else {
            firstSet = head;
            secondSet = head.next;
            secondSetHead = head.next;
        }

        while (true) {
            if (firstSet == null || secondSet == null || secondSet.next == null) {
                firstSet.next = secondSetHead;
                break;
            }

            firstSet.next = secondSet.next;
            firstSet = firstSet.next;

            if (firstSet.next == null) {
                secondSet.next = null;
                firstSet.next = secondSetHead;
            } else {
                secondSet.next = firstSet.next;
                secondSet = secondSet.next;
            }
        }
    }

    public static void main(String[] args) {
        Q4.Node<Integer> tail = new Q4.Node<>(null, 2);
        Q4.Node<Integer> n4 = new Q4.Node<>(tail, 4);
        Q4.Node<Integer> n3 = new Q4.Node<>(n4, 11);
        Q4.Node<Integer> n35 = new Q4.Node<>(n3, 20);
        Q4.Node<Integer> n2 = new Q4.Node<>(n35, 6);
        Q4.Node<Integer> head = new Q4.Node<>(n2, 8);

        Q4.printNodes(head);
        sortOddEvenNodes(head);
        Q4.printNodes(head);
    }
}
