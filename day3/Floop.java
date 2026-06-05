import java.util.Scanner;

class Floop
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Print 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Print even numbers
        System.out.println("Even Numbers from 1 to 20:");
        for(int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Multiplication table
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiplication Table of " + n);
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}