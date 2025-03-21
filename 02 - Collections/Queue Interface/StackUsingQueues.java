import java.util.*;

class StkQue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q1.add(x);
    }

    // Removes and returns top of the stack
    public int pop() {
        if (q1.isEmpty()) return -1;

        // Move all but last to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int popped = q1.remove();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    // Returns top without removing
    public int top() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueues {
    public static void main(String[] args) {
        StkQue stack = new StkQue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop()); // 3
        System.out.println("Top: " + stack.top()); // 2
    }
}
