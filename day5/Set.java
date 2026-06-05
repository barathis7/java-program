import java.util.HashSet;

class Set {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate value

        System.out.println("Set Elements:");
        for(String item : set) {
            System.out.println(item);
        }
    }
}