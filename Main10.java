public class Main10 {
    public static void main(String[] args) {
        // Demonstration of HashMap
        java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap output: " + hashMap);

        // Specific method for HashMap: getOrDefault
        System.out.println("GetOrDefault (HashMap): " + hashMap.getOrDefault("Four", 0));

        // Demonstration of LinkedHashMap
        java.util.LinkedHashMap<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        System.out.println("LinkedHashMap output: " + linkedHashMap);

        // Specific method for LinkedHashMap: accessOrder (used during initialization)
        java.util.LinkedHashMap<String, Integer> accessOrderLinkedHashMap = new java.util.LinkedHashMap<>(16, 0.75f,
                true);
        accessOrderLinkedHashMap.put("One", 1);
        accessOrderLinkedHashMap.put("Two", 2);
        accessOrderLinkedHashMap.put("Three", 3);
        accessOrderLinkedHashMap.get("One"); // Accessing to change order
        System.out.println("LinkedHashMap with access order: " + accessOrderLinkedHashMap);

        // Demonstration of TreeMap
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        System.out.println("TreeMap output: " + treeMap);

        // Specific method for TreeMap: firstEntry
        System.out.println("FirstEntry (TreeMap): " + treeMap.firstEntry());
    }
}
