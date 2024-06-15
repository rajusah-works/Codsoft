import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int TotalPoints = 100;
        final int maxAttempts = 5;
        boolean TryAgain = true;

        System.out.println("Welcome and Embrace Yourself for the Wager");
        System.out.println("Try to guess the number & Hope you choose the right one!");

            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Random number is generated and is selected between 1 and 100.");

            int choice;
            int NOG = 0;
            boolean GC = false;

            while (NOG < maxAttempts && !GC) {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                NOG++;

                if (choice > randomNumber) {
                    System.out.println("Too high! Try your luck again.");
                } else if (choice < randomNumber) {
                    System.out.println("Too low! Try your luck again.");
                } else {
                    System.out.println("Congratulations\n You got this time in " + NOG + " attempts.");
                    GC = true;
                    
                }
            }

            if (!GC) {
                System.out.println("Oops!\n you lost all your attempts. The number was: " + randomNumber);
                
            }

            if (TotalPoints > 0) {
                System.out.println("Would you like to try again? (yes/no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes")) {
                    TryAgain = false;
                }
            }
            System.out.println("Thanks for your time.Hope you enjoyed our Wager!");
            scanner.close();
        }
        
    }
