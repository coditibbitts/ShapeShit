// Prints a diamond based on the user's input
import java.util.Scanner;

public class MenuThree {

    // Main driver of class. Will print out diamond with an inputted
    // row number
    public static void printDiamonds () {

        int input; // User's input
        Scanner in = new Scanner(System.in); // Scanner object

        do {
            System.out.print("Enter number of rows (odd number 1 to 19): ");
            input = in.nextInt();
            in.nextLine();

        } while (!inputCheck(input));

        // Draws the diamond
        drawDiamond(input);

    } // End Method userInput

    // Processing Method
    // Checks the user's input to see if it's valid
    private static boolean inputCheck (int input) {

        if (((input % 2) != 0) && (input > 0 && input < 20)) {
            return true;

        } else  {
            System.out.println("** The inputted row number, " + input + ", is not correct. **");
            return false;

        }

    } // End Method inputCheck

    // Output Method
    // Prints out a diamond with an inputted row.
    private static void drawDiamond (int input) {

        int start = 1; // Start of where to count from (1,2 ,3 ,4 ,5, ... etc.)
        int i; // Generic Counter
        int k; // Generic Counter
        int inputMedian = (input/2) + 1; // Median of user's inputted integer

        // Counts the lines being printed
        for (i = start; i <= input; i++) {

            // Checks if i is before the median (mid-point) of the loop
            if (i < inputMedian) {

                for (k = start; k <= input; k++) {

                    // Checks if k is inbetween +-i to median
                    if ((k > (inputMedian) - i) && (k < (inputMedian) + i)) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");

                    }

                }

            }

            // Checks if i is at the median (mid-point) of the loop
            if (i == inputMedian) {

               for (k = start; k <= input; k++) {
                   System.out.print("*");

               }

            }

            // Checks if i is after the median (mid-point) of the lopp
            if (i > inputMedian) {

                for (k = start; k <= input; k++) {

                    /*
                    * Checks to see if k is within a certain range of the start and end numbers
                    * by using the difference between i and inputMedian (the range that i deviates
                    * from inputMedian).
                    */
                    if (k >= (start + (i - inputMedian)) && k <= (input - (i - inputMedian))) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");

                    }

                }

            }

            System.out.println();

        } // End main for-loop

    } // End Method drawDiamond

} // End Class MenuThree
