import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int times = 10;
        int timesguesed = 0;
        Random random = new Random();
        int hiddennumber = random.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);
        

        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (times > 0) {
            System.out.println("You have " + times + " attempts left. Enter your guess:");
            int x = scan.nextInt();
            times--;
            timesguesed++;

            if (x == hiddennumber) {
                System.out.println("Congratulations! You guessed it! The number was " + hiddennumber);
                System.out.println("You guessed it in " + timesguesed + " attempts.");
               
                break;
            } else if (x < hiddennumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (timesguesed==10) {
            System.out.println("Game Over! You've run out of attempts.");
            System.out.println("The secret number was: " + hiddennumber);
        }
        
        scan.close();
    }
}