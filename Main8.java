import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main8 {
    public static void main(String[] args) {
        // HashSet does not maintain any order
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println("HashSet output: " + hashSet);
        // Specific method for HashSet: clear()
        hashSet.clear();
        System.out.println("HashSet after clear: " + hashSet);

        // LinkedHashSet maintains insertion order
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet output: " + linkedHashSet);
        // Specific method for LinkedHashSet: size()
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // TreeSet maintains natural ordering (alphabetical in this case)
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        System.out.println("TreeSet output: " + treeSet);
        // Specific method for TreeSet: first()
        System.out.println("First element in TreeSet: " + treeSet.first());
    }
}
