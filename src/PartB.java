public class PartB {
    public static void main(String[] args) {
        int row, col;

        // Task 7
        System.out.println("Task 7:");
        for (row = 1; row <= 5; row++) {
            for (col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(); // space after task

        // Task 5
        System.out.println("Task 5:");
        for (row = 1; row <= 5; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(); // space after task

        // Task 6
        System.out.println("Task 6:");
        for (row = 5; row >= 1; row--) {
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(); // space after task
    }
}