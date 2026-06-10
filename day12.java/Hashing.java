import java.util.HashMap;

public class Hashing
 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Barath");
        map.put(102, "Kumar");
        map.put(103, "Java");

        // Display values
        System.out.println(map);

        // Search by key
        System.out.println("Key 102: " + map.get(102));

        // Remove a key
        map.remove(103);

        System.out.println("After Removal: " + map);
    }
}