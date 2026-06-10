import java.util.HashMap;

public class Hashingmap {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1, 4, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Display frequencies
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}