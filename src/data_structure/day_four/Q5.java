package data_structure.day_four;

public class Q5 {

    public static Q4.Node<Integer> nthToLast(Q4.Node<Integer> head, int n) {

        Q4.Node<Integer> firstNode = head;
        Q4.Node<Integer> secondNode = head;

        if (n == 0) {
            return null;
        }

        for (int i = 0; i < n; i++) {
            if (secondNode != null) {
                secondNode = secondNode.next;
            } else {
                return null;
            }
        }

        while (secondNode != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        return firstNode;
    }


    public static void main(String[] args) { //last here is the tail NULL
        Q4.Node<Integer> tail = new Q4.Node<>(null, 2);
        Q4.Node<Integer> n4 = new Q4.Node<>(tail, 4);
        Q4.Node<Integer> n3 = new Q4.Node<>(n4, 11);
        Q4.Node<Integer> n2 = new Q4.Node<>(n3, 6);
        Q4.Node<Integer> head = new Q4.Node<>(n2, 8);

        Q4.printNodes(head);
        System.out.println(nthToLast(head, 4).data);
    }
}
