class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) {
            System.out.println("Attempt to pop from an empty stack.");
            return null; // Return null and print a message
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (top == null) {
            System.out.println("Attempt to peek into an empty stack.");
            return null; // Return null and print a message
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class Main5a {

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Popped from integer stack: " + intStack.pop());

        Stack<Double> doubleStack = new Stack<>();
        doubleStack.push(11.5);
        doubleStack.push(22.5);
        System.out.println("Popped from double stack: " + doubleStack.pop());

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Popped from string stack: " + stringStack.pop());
    }
}
