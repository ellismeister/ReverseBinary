import java.util.Scanner;

public class ReverseBinary {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int number = scnr.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number!");
        } else {
            while (number > 0) {
                int remainder = number % 2;
                System.out.print(remainder);
                number = number / 2;
            }
            System.out.println();
        }
    }
}
