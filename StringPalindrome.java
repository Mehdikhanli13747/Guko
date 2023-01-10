public class StringPalindrome {
    public static void main(String[] args) {
        // given string
        String sample = "action";

        //true if it is polindrome, false if it is not
        boolean flag = true;

        // polindrome is string that is exactly same from both sides
        // this loop checks if i'th and (length - i)'th characters are the same 
        for(int i = 0; i < sample.length(); i++) {
            if(sample.charAt(i) != sample.charAt(sample.length() - 1 - i)) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("it is Polindrome");
        }
        else
            System.out.println("It is not Polindrome");
    }
}
