import java.util.ArrayList;
import java.util.List;

// A generic class with a bounded type parameter
class Box<T extends Number> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public class Main1 {

    public static double sumOfBoxContents(List<? extends Box<? extends Number>> list) {
        double sum = 0.0;
        for (Box<? extends Number> box : list) {
            Number number = box.get();
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(15.5);

        List<Box<? extends Number>> list = new ArrayList<>();
        list.add(integerBox);
        list.add(doubleBox);

        double sum = sumOfBoxContents(list);
        System.out.println("The sum of the box contents is: " + sum);
    }
}
