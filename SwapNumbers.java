import java.util.Scanner;

/*General Note: swapping numbers is similar to swapping hands
 * imagine u have one apple in each hands. U want to switch them.
 * To do so, U need to put left apple on table, switch right to left hand.
 * And at the end grab the apple on the table to your left hand. 
 */
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // left apple
        int number1 = scanner.nextInt();
        // right apple
        int number2 = scanner.nextInt();
        
        System.out.println(number1 + " " + number2);
        // table 
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(number1 + " " + number2);
    }
}
