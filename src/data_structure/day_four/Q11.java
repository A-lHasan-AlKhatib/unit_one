package data_structure.day_four;


import java.util.Stack;

public class Q11 {
    public static void reverseNodes(Q4.Node<Integer> head) {
        Stack<Q4.Node<Integer>> stack = new Stack<>();
        while (head.next != null) {
            stack.add(head);
            head = head.next;
        }
        // here the tail is the head

        while (!stack.empty()) {
            head.next = stack.pop();
            head = head.next;
        }

        head.next = null;
    }

    public static void main(String[] args) {
        Q4.Node<Integer> tail = new Q4.Node<>(null, 2);
        Q4.Node<Integer> n4 = new Q4.Node<>(tail, 4);
        Q4.Node<Integer> n3 = new Q4.Node<>(n4, 11);
        Q4.Node<Integer> n2 = new Q4.Node<>(n3, 6);
        Q4.Node<Integer> head = new Q4.Node<>(n2, 8);

        Q4.printNodes(head);
        reverseNodes(head);
        Q4.printNodes(tail);
    }
}
