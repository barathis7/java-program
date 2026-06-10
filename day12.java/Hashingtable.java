import java.util.Hashtable;

public class Hashingtable {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        // Insert values
        table.put(101, "Barath");
        table.put(102, "Kumar");
        table.put(103, "Java");

        // Display Hashtable
        System.out.println("Hashtable: " + table);

        // Search
        System.out.println("Key 102: " + table.get(102));

        // Remove
        table.remove(103);

        System.out.println("After Removal: " + table);
    }
}