public class SumEvenOddArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};

        int sumEven = 0;
        int sumOdd  = 0;

        for(int i = 0; i < array.length; i++) {
            // for a given element of array, checking if divisible by 2
            // if so, sum it with evens
            if (array[i] % 2 == 0)
                sumEven += array[i];
            // else sum it with odds
            else
                sumOdd += array[i];
        } 
    }   
}
