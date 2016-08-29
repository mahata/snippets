// P. 81

class Node {
    public Object data;
    public Node next;

    public Node(Object data) {
        this.data = data;
    }
}

class Stack {
    Node top;

    Object pop() {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(Object item) {
        Node t = new Node(item);
        t.next = top;
        top = t;
    }

    Object peek() {
        return top.data;
    }
}

public class StackP {
    public static void main(String[] args) {
        // int arr[] = {2, 5, -2, 6, -3};
        // System.out.println(arr[0]);

        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
    }
}
