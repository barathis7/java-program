import java.util.LinkedList;

public class Linkedlistaddatend{
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Add at Beginning
        list.addFirst("Java");

        // Add at End
        list.addLast("Python");
        list.addLast("C");

        System.out.println("After Adding:");
        System.out.println(list);

        // Delete from Beginning
        list.removeFirst();

        System.out.println("After Deleting First:");
        System.out.println(list);

        // Delete from End
        list.removeLast();

        System.out.println("After Deleting Last:");
        System.out.println(list);
    }
}