import java.util.LinkedList;

public class Main13 {
    static class HashTable {
        private int BUCKET; // Number of buckets in the hash table
        private LinkedList<Integer>[] table; // Array of linked lists for Separate Chaining

        public HashTable(int bucketCount) {
            BUCKET = bucketCount;
            table = new LinkedList[BUCKET];
            for (int i = 0; i < BUCKET; i++) {
                table[i] = new LinkedList<>();
            }
        }

        // Hash function to find index for a key
        private int getBucketIndex(int key) {
            return key % BUCKET;
        }

        // Adds a key to the hash table
        public void insert(int key) {
            int bucketIndex = getBucketIndex(key);
            table[bucketIndex].addFirst(key);
        }

        // Removes a key from the hash table
        public void delete(int key) {
            int bucketIndex = getBucketIndex(key);
            table[bucketIndex].remove((Integer) key);
        }

        // Checks if the hash table contains the key
        public boolean contains(int key) {
            int bucketIndex = getBucketIndex(key);
            return table[bucketIndex].contains(key);
        }

        // Displays the hash table
        public void display() {
            for (int i = 0; i < BUCKET; i++) {
                System.out.print(i + ": ");
                for (Integer key : table[i]) {
                    System.out.print(key + " -> ");
                }
                System.out.println("NULL");
            }
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10); // Create a hash table with 10 buckets
        ht.insert(10);
        ht.insert(20);
        ht.insert(30);
        ht.insert(40);
        ht.insert(50);
        ht.insert(60);
        ht.insert(70);
        ht.insert(80);
        ht.insert(90);
        ht.insert(100);
        ht.insert(110);

        ht.display();

        ht.delete(30);
        ht.delete(80);

        System.out.println("After deletion:");
        ht.display();

        System.out.println("Contains 50: " + ht.contains(50));
        System.out.println("Contains 75: " + ht.contains(75));
    }
}
