import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        // Original Map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Inverted Map
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // Add key to the list for this value
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        // Print result
        System.out.println("Inverted Map: " + invertedMap);
    }
}
