public class DivisibleBy3And5 {
    public static void main(String[] args) {
        int num = 16;

        for(int i = 1; i <= num; i++) {
            // checking if number is divisible by 3
            if (i % 3 == 0) {
                // checking if number is divisible by 5
                if (i % 5 == 0)
                    // if number is divisible by 3 and 5, it is divisible by 15 
                    System.out.println(i + " FINRA");
                else
                    System.out.println(i + " FIN");
            }
            // checking if number is divisible by 5
            else if (i % 5 == 0)
                System.out.println(i + " RA");
            else
                System.out.println(i);
        }
    }
}
