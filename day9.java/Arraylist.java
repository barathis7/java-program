import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        System.out.println(list);

        for(String s : list) {
            System.out.println(s);
        }
    }
}