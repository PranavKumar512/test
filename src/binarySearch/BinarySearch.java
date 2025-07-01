package binarySearch;

public class BinarySearch {

    public static int binarySearchI(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;
    }

    public static int binarySearchR(int[] arr, int target, int start, int end) {
        if (start <= end) {

            int mid = start + (end - start) / 2;
           
            if (target > arr[mid]) {
                return binarySearchR(arr, target, mid + 1, end);
            } else if (target < arr[mid]) {
                return binarySearchR(arr, target, start, mid - 1);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 6, 8, 12, 19};
        System.out.println(binarySearchR(arr, 6, 0, arr.length - 1));

    }
}
