public class ArmstrongNumber {
    public static void main(String[] args) {
        // given number
        int num = 153;
        //saving the actual value
        int number = num;
        //sum of cubes of digits
        int sum = 0;

        //finding digits, finding its cubes and summing them up
        while (num > 0) {
            sum += Math.pow(num % 10, 3);
            num /= 10;
        }
        //if sum is equal to number itself, it is armstrong
        if (number == sum) System.out.println("It is armstrong");
    }
}
