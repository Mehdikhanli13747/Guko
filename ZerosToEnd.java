
/* this apporach uses one array to perform action due to memory concerns */
/* the version in the pdf is quite good approach. If hard, Ask for help */
public class ZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {1, 0, 23, 4, 0, 0, 12, 2};

        /* checking every element with all elements in the l */
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0 && arr[j] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int ins : arr) {
            System.out.print(ins + " ");
        }
    }
}
