import java.util.LinkedHashMap;

public class Linkedhashmap{
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Insert values
        map.put(101, "Barath");
        map.put(102, "Kumar");
        map.put(103, "Java");

        // Display map
        System.out.println(map);

        // Get value by key
        System.out.println("Key 102: " + map.get(102));

        // Remove a key
        map.remove(103);

        System.out.println("After Removal: " + map);
    }
}