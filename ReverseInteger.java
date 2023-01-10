import java.util.Scanner;

/* General Note: to reverse an integer there are 2 main ways available.
 * Way 1, U can cast integer to string, perform ReverseString, and cast to integer again
 * Way 2, obtain every digit of integer with its position.
 * Then add it to second integer. Described Below.
 * Free to ask questions. :D
 */
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Way 1

        /* Converting integer to String */
        int num = scanner.nextInt();
        int newInt = ReverseInteger.reversedString(num);
        System.out.println(newInt);

        /* read as a String */
        String numString = scanner.next();
        int newInt2 = ReverseInteger.reversedString(numString);
        System.out.println(newInt2);

        // Way 2
        int number = scanner.nextInt();
        int newNumber = 0;

        int power = 0;
        int length = Integer.toString(number).length();

        while (number > 0) {
            int digit = number % 10;
            newNumber += digit * Math.pow(10, length - 1 - power++);
            number /= 10;
        }

        System.out.println(newNumber);
    }

    public static int reversedString(String str) {
        String reversednumString = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversednumString += str.charAt(i);
        }
        int result = Integer.valueOf(reversednumString);
        return result;
    }
    public static int reversedString(int num) {
        /* 3 ways to convert integer to String; pick one */
        // String num2 = Integer.toString(eded);
        // String targ = String.format("%s", eded);
        String str = String.valueOf(num);

        String reversednumString = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversednumString += str.charAt(i);
        }
        int result = Integer.valueOf(reversednumString);
        return result;
    }
}
