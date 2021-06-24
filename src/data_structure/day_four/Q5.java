package data_structure.day_four;

public class Q5 {
    public static Q4.Node<Integer> nthToLast(Q4.Node<Integer> head, int n) { //last here is the tail NULL
        if (head == null || n < 1) {
            return null;
        }
        Q4.Node<Integer> p1 = head;
        Q4.Node<Integer> p2 = head;

        for (int j = 0; j < n - 1; ++j) {
            if (p2 == null) {
                return null;
            }
            p2 = p2.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {
        Q4.Node<Integer> tail = new Q4.Node<>(null, 2);
        Q4.Node<Integer> n4 = new Q4.Node<>(tail, 4);
        Q4.Node<Integer> n3 = new Q4.Node<>(n4, 11);
        Q4.Node<Integer> n2 = new Q4.Node<>(n3, 6);
        Q4.Node<Integer> head = new Q4.Node<>(n2, 8);

        Q4.printNodes(head);
        System.out.println(nthToLast(head,0).data);
    }
}
