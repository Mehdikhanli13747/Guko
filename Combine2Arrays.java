import java.util.Scanner;

public class Combine2Arrays {
    public static void main(String[] args) {
        // 2 int arrays

        int arr1[] = {1, 2, 3, 4}; //change as u want
        int arr2[] = {5123, 4, 325, 23, 352}; //change as u want
        // the length of container array is the sum of lengths of each array
        int arr3[] = new int[arr1.length + arr2.length];

        // assigning first arrays elements
        // starting from 0th index to (arr1.length - 1)th index
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        // assigning second arrays elements
        // since array is half full, we need to start adding
        // from the index arr1.length - 1 to arr1.length + arr2.length - 1 
        for(int i = 0; i < arr2.length; i++) {
            arr3[arr1.length - 1 + i] = arr2[i];
        }
        for (int element : arr3) {
            System.out.println(element);
        }
    }
}
