import java.util.Random;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            int rollNumber = 0;
            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("-----------------------------------");

            int die1, die2, die3;
            do {
                rollNumber++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Print formatted output
                System.out.printf("%-8d%-8d%-8d%-8d%-8d\n", rollNumber, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("\nRoll again? (Y/N): ");
            response = scanner.next();
        } while (response.equalsIgnoreCase("y"));

        scanner.close();
    }
}