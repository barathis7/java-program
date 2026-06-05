import java.util.HashMap;

class Map{
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Barath");
        map.put(102, "Kumar");
        map.put(103, "Ravi");

        System.out.println("Map Elements:");

        for(Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}