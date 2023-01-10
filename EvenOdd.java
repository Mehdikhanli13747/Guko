import java.util.Scanner;

/* General Note: if number is even, it is divided by 2 without a reminder */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        
        if (number % 2 == 0) System.out.println("The number is Even");
        else System.out.println("The number is Odd");

        // with ternary operators - Not familiar? ask for help :D
        String divisible = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + divisible);
    }
}
