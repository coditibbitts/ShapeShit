// Prints a series of triangles in different formats
// on top of each other
public class MenuOne {

    // Output Method
    // Prints all the triangles in the class on top of each other
    public static void printTriangles() {

        triangleOne();
        System.out.println();

        triangleTwo();
        System.out.println();

        triangleThree();
        System.out.println();

        triangleFour();
        System.out.println();

    } // End Method triangleFour

    // Output Method
    // Prints the first triangle in the  class
    private static void triangleOne() {

        int count = 10; // Amount of asterisks to draw
        int i; // Generic counter
        int k; // Generic counter

        for (i = 0; i < count; i++) {

            for (k = 0; k <= i; k++) {
                System.out.print('*');

            }

            System.out.println();

        }

    } // End Method triangleOne

    // Output Method
    // Prints the second triangle in the class
    private static void triangleTwo() {

        int count = 10; // Amount of asterisks to draw
        int i; // Generic counter
        int k; // Generic counter

        for (i = 0; i < count; i++) {

            for (k = (count - 1); k >= i; k--) {
                System.out.print('*');

            }

            System.out.println();

        }

    } // End Method triangleTwo

    // Output Method
    // Prints the third triangle in the class
    private static void triangleThree() {

        int count = 10; // Amount of asterisks to draw
        int i; // Generic counter
        int k; // Generic counter

        for (i = 0; i < count; i++) {

            for (k = 0; k < count; k++) {

                if (k >= i) {
                    System.out.print('*');

                } else {
                    System.out.print(' ');

                }

            }

            System.out.println();

        }

    } // End Method triangleOne

    // Output Method
    // Prints the fourth triangle in the class
    private static void triangleFour() {

        int count = 10; // Amount of asterisks to draw
        int i; // Generic counter
        int k; // Generic counter

        for (i = (count - 1); i >= 0; i--) {

            for (k = 0; k < count; k++) {

                if (k >= i) {
                    System.out.print('*');

                } else {
                    System.out.print(' ');

                }

            }

            System.out.println();

        }

    } // End Method triangleFour

} // End Class MenuOne
