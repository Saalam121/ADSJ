class LinearProbingHashTable {
    private int currentSize, maxSize;
    private String[] keys;
    private String[] vals;

    public LinearProbingHashTable(int capacity) {
        currentSize = 0;
        maxSize = capacity;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }

    public void insert(String key, String val) {
        int tmp = hash(key);
        int i = tmp;
        do {
            if (keys[i] == null) {
                keys[i] = key;
                vals[i] = val;
                currentSize++;
                return;
            }
            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }
            i = (i + 1) % maxSize;
        } while (i != tmp);
    }

    public String get(String key) {
        int i = hash(key);
        while (keys[i] != null) {
            if (keys[i].equals(key))
                return vals[i];
            i = (i + 1) % maxSize;
        }
        return null;
    }

    public void delete(String key) {
        if (get(key) == null)
            return;

        int i = hash(key);
        while (!key.equals(keys[i]))
            i = (i + 1) % maxSize;
        keys[i] = vals[i] = null;

        for (i = (i + 1) % maxSize; keys[i] != null; i = (i + 1) % maxSize) {
            String tmp1 = keys[i], tmp2 = vals[i];
            keys[i] = vals[i] = null;
            currentSize--;
            insert(tmp1, tmp2);
        }
        currentSize--;
    }

    private int hash(String key) {
        return key.hashCode() % maxSize;
    }

    public int getSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}

public class Main14 {
    public static void main(String[] args) {
        LinearProbingHashTable lph = new LinearProbingHashTable(10);
        lph.insert("key1", "value1");
        lph.insert("key2", "value2");
        lph.insert("key3", "value3");

        System.out.println("key1: " + lph.get("key1"));
        System.out.println("key2: " + lph.get("key2"));
        System.out.println("key3: " + lph.get("key3"));

        lph.delete("key2");
        System.out.println("After deleting key2, key2: " + lph.get("key2"));
    }
}
