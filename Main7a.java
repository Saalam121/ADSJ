import java.util.ArrayList;

public class Main7a {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("Hello");
        queue.enqueue("World");
        System.out.println(queue.dequeue()); // Outputs "Hello"
        System.out.println(queue.peek()); // Outputs "World"
        System.out.println(queue.dequeue()); // Outputs "World"
        System.out.println(queue.dequeue()); // Outputs "null"
    }
}

class GenericQueue<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void enqueue(T element) {
        list.add(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null; // Return null instead of throwing an exception
        }
        return list.remove(0);
    }

    public T peek() {
        if (isEmpty()) {
            return null; // Return null instead of throwing an exception
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
