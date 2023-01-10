public class LargestNumInArray {
    public static void main(String[] args) {
        //given array
        int arr[] = {1, 42, 32, 43, 21, 234, -12, 4};

        //choosing the first element of array as comparing value
        // currently it is our max. We will check with all elements
        int max = arr[0];

        // if any of the element int he array is greater than max, then we make it max
        for(int element : arr) {
            if (element > max) {
                max =  element;
            }
        }
        System.out.println(max);
    }
}
