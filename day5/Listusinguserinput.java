import java.util.ArrayList;
import java.util.Scanner;

class Listusinguserinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter 3 names: ");

        for(int i = 0; i < 3; i++) {
            list.add(sc.next());
        }

        System.out.println("List Elements:");
        for(String name : list) {
            System.out.println(name);
        }

        sc.close();
    }
}