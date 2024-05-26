import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Main4 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Elephant");
        linkedList.add("Frog");
        linkedList.add("Giraffe");
        linkedList.add("Hippo");

        System.out.println("ArrayList elements:");

        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("LinkedList elements:");
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
    }
}
