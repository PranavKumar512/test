package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 3, 2, 4, 6, 9};
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }


        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
