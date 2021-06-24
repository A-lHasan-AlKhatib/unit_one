package data_structure.day_four;

import java.util.Stack;

public class Q9 {

    static class Queue {
        static Stack<Integer> stack1;
        static Stack<Integer> stack2;

        public Queue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        //remove all stack1 to stack2 then add to stack1 then empty stack2 back into stack1
        static void enQueue(int x) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            stack1.push(x);

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }


        static Integer deQueue() {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty.");
                return null;
            }
            return stack1.pop();
        }
    }

    ;
}
