import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();

        // Add songs
        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Perfect");

        System.out.println("Playlist:");

        // Traverse LinkedList
        for (String song : playlist) {
            System.out.println(song);
        }

        // Play first song
        System.out.println("\nNow Playing: " + playlist.getFirst());

        // Remove a song
        playlist.remove("Believer");

        System.out.println("\nUpdated Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}