import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Person {
    private int income;
    private int age;
    private String name;

    public Person(int income, int age, String name) {
        this.income = income;
        this.age = age;
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", income=" + income + "}";
    }
}

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Person> setA = new HashSet<>();
        Set<Person> setB = new HashSet<>();
        Set<Person> setC = new HashSet<>();
        Set<Person> setBC = new HashSet<>();

        System.out.println("Enter the number of persons:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, age, and income for person " + (i + 1) + ":");
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            int income = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            Person person = new Person(income, age, name);
            setA.add(person);

            if (age > 60) {
                setB.add(person);
            }
            if (income < 10000) {
                setC.add(person);
            }
        }

        // Compute intersection of set B and set C
        setBC.addAll(setB);
        setBC.retainAll(setC);

        // Output the sets
        System.out.println("Set A: " + setA);
        System.out.println("Set B (Age > 60): " + setB);
        System.out.println("Set C (Income < 10000): " + setC);
        System.out.println("Set B ∩ C: " + setBC);

        scanner.close();
    }
}
