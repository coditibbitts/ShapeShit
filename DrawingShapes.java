/* Name        : Codi Tibbitts
 * Due Date    : Sept 29, 2018
 * Class       : CISP 401, Fall 2018
 * Teacher     : Sonny Huang
 * Description : Write a Java application that outputs a menu.
 * The user will then select from one of the many choices that draws
 * different shapes.
 */
import javax.swing.JOptionPane;

public class DrawingShapes {

    public static void main (String[] args) {

        String menuChoice; // User's entered menu choice

        // Main part of program
        // Repeats dialog box until a "4" is entered
        do {

            // Opens a dialog box for user to enter their choice
            menuChoice = JOptionPane.showInputDialog(printMenu());

            // Switch statement to print menu choices
            switch (menuChoice) {
                case "1":
                    MenuOne.printTriangles();
                    break;

                case "2":
                    MenuTwo.printTriangles();
                    break;

                case "3":
                    MenuThree.printDiamonds();
                    break;

                case "4":
                    // Exits the program
                    System.out.println("Thanks for using this program!");
                    break;

                default:
                    // If none of the above are selected returns error statement
                    System.out.println("Invalid Value Entered");
                    break;

            }

        } while (!menuChoice.equals("4"));

    } // End Method main

    // Output Method
    // Prints a menu for user to read
    public static String printMenu() {

        // Holds whole string to use for dialog box
        // Uses a string since dialog box requires a returned String
        String menu = "Draw Triangles and Diamond shapes\n" +
                      "Enter 1 to draw four separate triangles\n" +
                      "Enter 2 to draw four triangle at the same row\n" +
                      "Enter 3 to draw a diamond\n" +
                      "Enter 4 to exit the program";

        return menu;

    } // End Method printMenu

} // End Class DrawingShapes
