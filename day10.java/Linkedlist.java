import java.util.LinkedList;

public class Linkedlist{
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        System.out.println(list);

        for(String s : list) {
            System.out.println(s);
        }
    }
}