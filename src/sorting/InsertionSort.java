package sorting;

class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 8, 3, 2, 4, 6, 9};

        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;

            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }

        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}
