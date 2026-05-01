import java.util.Scanner;

public class Task3 {

    public long calculateFactorial() {
        Scanner scan = new Scanner(System.in);
        long result = 1;

        System.out.println("Enter a positive number to get its factorial:");
        long n = scan.nextLong();

        if (n < 0) {
            System.out.println("Error: Factorial of negative numbers is undefined.");
            return -1;
        }
        if (n == 0) {
            return 1;
        }

        while (n > 0) {
            result *= n;
            n--;
        }

        return result;
    }

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        long output = t3.calculateFactorial();

        if (output != -1) {
            System.out.println("The factorial is: " + output);
        }
    }
}