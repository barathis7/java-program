import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;   // Secret number

        System.out.println("Guess the secret number between 1 and 10:");

        int guess = sc.nextInt();

        if (guess == secretNumber) {
            System.out.println("Correct! You guessed the secret number.");
        } 
        else if (guess < secretNumber) {
            System.out.println("Too low! Try again.");
        } 
        else {
            System.out.println("Too high! Try again.");
        }

        sc.close();
    }
}