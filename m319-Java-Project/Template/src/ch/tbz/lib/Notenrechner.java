package ch.tbz.lib;
import static ch.tbz.lib.Input.inputString;
import java.util.Scanner;

public class Notenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests;
        do {
            System.out.println("How many tests?");
            numTests = scanner.nextInt();

            if (numTests < 3) {
                System.out.println("Error: At least 3 tests are required.");
            }
        } while (numTests < 3);

        double sumMarks = 0.0;
        for (int i = 1; i <= numTests; i++) {
            System.out.print("Enter the " + i + ". mark: ");
            double mark = scanner.nextDouble();

            if (mark < 1.0 || mark > 6.0) {
                System.out.println("Error: Marks must be between 1.0 and 6.0.");
                i--; // Repeat input for the same test
                continue;
            }

            sumMarks += mark;
        }

        double average = sumMarks / numTests;
        System.out.println("Your average mark is: " + String.format("%.2f", average));

        if (average >= 5.5) {
            System.out.println("Bravo, gut gemacht!");
        }

        String response;
        do {
            System.out.println("Do you want to enter other marks? (Yes or no)");
            response = scanner.next();

            if (response.equalsIgnoreCase("yes")) {
                int additionalTests;
                do {
                    System.out.println("How many additional tests?");
                    additionalTests = scanner.nextInt();

                    if (additionalTests < 1) {
                        System.out.println("Error: At least 1 test is required.");
                    } else {
                        for (int i = 1; i <= additionalTests; i++) {
                            System.out.print("Enter the " + i + ". mark: ");
                            double additionalMark = scanner.nextDouble();

                            if (additionalMark < 1.0 || additionalMark > 6.0) {
                                System.out.println("Error: Marks must be between 1.0 and 6.0.");
                                i--; // Repeat input for the same test
                            } else {
                                sumMarks += additionalMark;
                            }
                        }
                    }
                } while (additionalTests < 1);

                average = sumMarks / (numTests + additionalTests);
                System.out.println("Your updated average mark is: " + String.format("%.2f", average));

                if (average >= 5.5) {
                    System.out.println("Bravo, gut gemacht!");
                }
            }
        } while (response.equalsIgnoreCase("yes"));
        scanner.close();
    }
}