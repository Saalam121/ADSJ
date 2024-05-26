class GenericQueue_arr<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    public GenericQueue_arr(int size) {
        capacity = size;
        queue = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add an element to the queue
    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        count++;
    }

    // Remove an element from the queue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T item = queue[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (count == capacity);
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class GenericQueue_ll<T> {
    private Node<T> front, rear;

    // Enqueue an element to the queue
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue an element from the queue
    public T dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (front == null);
    }
}

public class Main5b {

    public static void main(String[] args) {
        GenericQueue_arr<Integer> intQueue = new GenericQueue_arr<>(5);
        GenericQueue_ll<Integer> intQueue_ll = new GenericQueue_ll<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        System.out.println(intQueue.dequeue()); // Output: 1
        System.out.println(intQueue.dequeue()); // Output: 2
    }
}
