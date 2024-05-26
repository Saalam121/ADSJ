import java.util.LinkedList;

public class Main6b {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.pop()); // Outputs "World"
        System.out.println(stack.peek()); // Outputs "Hello"
        System.out.println(stack.isEmpty()); // Outputs false
    }
}

class GenericStack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return list.removeFirst();
        }
        return null; // Return null instead of throwing an exception
    }

    public T peek() {
        if (!isEmpty()) {
            return list.getFirst();
        }
        return null; // Return null instead of throwing an exception
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
