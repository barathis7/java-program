import java.util.*;

public class Queue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}