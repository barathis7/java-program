import java.util.Scanner;

class Countdigit(alternaterr){
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                count++;
                num /= 10;
            }
        }

        System.out.println(count);
        sc.close();
    }
}