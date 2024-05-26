import java.util.ArrayList;

public class Main6a {
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
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return list.remove(list.size() - 1);
        }
        return null; // Return null instead of throwing an exception
    }

    public T peek() {
        if (!isEmpty()) {
            return list.get(list.size() - 1);
        }
        return null; // Return null instead of throwing an exception
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
