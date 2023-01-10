public class UniqueLetters {
    public static void main(String[] args) {
        String str = "asjdbas";

        String sample = str.toLowerCase();


        outer: for(int i = 97; i <= 122; i++) {
            for (int j = 0; j < sample.length(); j++) {
                // System.out.println(sample.charAt(j) + " " + (char)i);
                if (sample.charAt(j) == (char)i) {
                    // System.out.print((char)i);
                    continue outer;
                }
            }
        }
        int arr[] = new int[26];

        for(int i = 0; i < sample.length(); i++) {
            char c = sample.charAt(i);

            arr[c-97]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                System.out.print((char)(i+97));
        }
    }
}
