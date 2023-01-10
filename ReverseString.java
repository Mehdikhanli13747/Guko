import java.util.Scanner;

/* General Note: Strings are immutable, means they are not modifiable.
 * To operate on a string, perform changes and assign to a new string variable
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String given = scanner.next(); // reading a word
        // String string = args[0]; // reading as command line argument
        // String string = scanner.nextLine(); //reading a line

        // initializing an empty string to able to concatenate 
        String reversed = "";

        /*General Algorithm: concatenating the characters of the string - <i>given</i>
         * to a new string - <i>reversed</i>
         */

        /* shorthand version

        for(int i = given.length(); --i >= 0;) {
            reversed += given.charAt(i);
        }
         */


        //exended version of previous loop

        //last index of the string - given.length() - 1
        //first index of the string - 0
        //iterating from greater to lower index, thus i--
        for(int i = given.length() - 1; i >= 0; i--) {
            reversed = reversed + given.charAt(i);
        }

        System.out.println(reversed);
    }
}
