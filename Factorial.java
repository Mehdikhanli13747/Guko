public class Factorial {
    public static void main(String[] args) {
        // given number
        int num = 5;

        //holding factorial
        long factorial = 1;

        // multiplying from 2 to num:
        //   5! = 1 * 2 * 3 * 4 * 5 
        for(int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
