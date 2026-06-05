import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // List
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");

        System.out.println("List:");
        for(String s : list) {
            System.out.println(s);
        }

        // Set
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate ignored

        System.out.println("\nSet:");
        for(String s : set) {
            System.out.println(s);
        }

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Barath");
        map.put(102, "Kumar");

        System.out.println("\nMap:");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}