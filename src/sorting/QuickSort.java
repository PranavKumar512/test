package sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {

        int i = low-1;
        int pivot = arr[high];
        for(int j =low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] =  temp;
        return  i;

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }

}



