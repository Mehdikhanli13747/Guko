public class DiamondOfAsteriks {
    public static void main(String[] args) {
        int num = 3;
        String stars = "*";

        for(int i = 1;i <= num; i++) {
            System.out.format("%5s\n", stars);
            stars += "**";
        }
    }
}
