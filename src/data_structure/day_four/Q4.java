package data_structure.day_four;

public class Q4 {

    public static void printNodes(Node<Integer> node) {
        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.data).append(" -> ");
            node = node.next;
        }
        builder.append("NULL");
        System.out.println(builder.toString());
    }

    public static void removeMiddleNode(Node<Integer> node) {

        while (true) {
            if (node.next.next == null) {
                node.data = node.next.data;
                node.next.data = null;
                node.next = null;
                break;
            }
            node.setData(node.next.getData());
            node.setNext(node.next);

            node = node.next;
        }
    }

    public static void main(String[] args) {

        Node<Integer> tail = new Node<>(null, 2);
        Node<Integer> n4 = new Node<>(tail, 4);
        Node<Integer> n3 = new Node<>(n4, 11);
        Node<Integer> n2 = new Node<>(n3, 6);
        Node<Integer> head = new Node<>(n2, 8);
        printNodes(head);
        removeMiddleNode(n3);
        printNodes(head);

        //this is a simple implementation for a linked list node, the same logic could be used in a complete linked list implementation
    }

    public static class Node<T> {
        Node<T> next;
        T data;

        public Node(Node<T> next, T data) {
            this.next = next;
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }


}
