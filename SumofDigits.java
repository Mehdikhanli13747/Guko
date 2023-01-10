public class SumofDigits {
    public static void main(String[] args) {
        int num = 234234;
        int sum = 0;

        // we praticed. num % 10 gives its leftmost digit
        // everytime we divide the number by 10 so that 
        // if we take % 10 again, we have the next digit
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
