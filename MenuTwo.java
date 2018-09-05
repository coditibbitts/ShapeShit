// Prints a series of triangles in different formats
// side by side
public class MenuTwo {

    // Prints all four triangles
    public static void printTriangles () {

        int count = 10; // Max amount of asterisks to draw
        int i; // Generic counter for each line

        // Counts how many lines have been printed
        for (i = 0; i < count; i++) {

            triangleOne(i, count);
            triangleTwo(i, count);
            triangleThree(i, count);
            triangleFour(i, count);
            System.out.println();

        }

        System.out.println();

    } // End Method printTriangles

    // Output Method
    // Prints out first triangle
    private static void triangleOne (int counter,int count) {

        int i; // Generic counter

        for (i = 0; i <= count; i++) {

            if (i <= counter) {
                System.out.print('*');

            } else {
                System.out.print(" ");

            }

        } // Ends first triangle

        // Prints empty space at end of triangle line
        printEmptySpace();

    } // End Method triangleOne

    // Output Method
    // Prints out Second triangle
    private static void triangleTwo (int counter, int count) {

        int i; // Generic Counter

        for (i = (count - 1); i >= 0; i--) {

            if (i >= counter) {
                System.out.print('*');

            } else {
                System.out.print(" ");

            }

        } // Ends second triangle

        // Prints empty space at end of triangle line
        printEmptySpace();

    } // End Method triangleTwo

    // Output Method
    // Prints out third triangle
    private static void triangleThree (int counter, int count) {

        int i; // Generic Counter

        for (i = 0; i < count; i++) {

            if (i >= counter) {
                System.out.print('*');

            } else {
                System.out.print(' ');

            }

        } // Ends third triangle

        // Prints empty space at end of triangle line
        printEmptySpace();

    } // End Method triangleThree

    // Output Method
    // Prints out fourth triangle
    private static void triangleFour (int counter, int count) {

        int i; // Generic Counter

        for (i = (count -1); i >= 0; i--) {

            if (i <= counter) {
                System.out.print('*');

            } else {
                System.out.print(' ');

            }

        } // Ends fourth triangle

        // Prints empty space at end of triangle line
        printEmptySpace();

    } // End Method triangleFour

    // Output Method
    // Prints out empty spaces
    private static void printEmptySpace () {

        int count = 4; // How many empty spaces to print
        int i; // Generic Counter

        for (i = 0; i < count; i++ ) {
            System.out.print(" ");

        }

    } // End Method printEmptySpace

} // End Class MenuTwo
