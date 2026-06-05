import java.util.*;

public class Set {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate ignored

        for(String s : set) {
            System.out.println(s);
        }
    }
}