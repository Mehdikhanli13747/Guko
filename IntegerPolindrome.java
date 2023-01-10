public class IntegerPolindrome {
    public static void main(String[] args) {
        int num = 142342;

        boolean flag = true;

        int length = Integer.toString(num).length();

        int power = 0;
        for (int i = 0; i < length / 2; i++) {
            int leftDigit = num % (int)Math.pow(10, length - 1 - power++);
            int rightDigit = num % 10;
        }
    }
}
