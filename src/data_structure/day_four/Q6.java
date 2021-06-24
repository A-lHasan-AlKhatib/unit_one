package data_structure.day_four;

public class Q6 {
    public static Integer findMiddleNode(Q4.Node<Integer> head) {
        Q4.Node<Integer> oneStep = head;
        Q4.Node<Integer> twoSteps = head;
        while (oneStep != null && twoSteps.next != null && twoSteps.next.next != null) {
            oneStep = oneStep.next;
            twoSteps = twoSteps.next.next;
        }
        return oneStep.data;
    }

    public static void main(String[] args) {
        Q4.Node<Integer> tail = new Q4.Node<>(null, 2);
        Q4.Node<Integer> n4 = new Q4.Node<>(tail, 4);
        Q4.Node<Integer> n3 = new Q4.Node<>(n4, 11);
        Q4.Node<Integer> n2 = new Q4.Node<>(n3, 6);
        Q4.Node<Integer> head = new Q4.Node<>(n2, 8);

        System.out.println(findMiddleNode(head));
    }
}
