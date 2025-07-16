package sorting;

class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 8, 3, 2, 4, 6, 9};

        for(int i=0; i<arr.length-1; i++) {
            int minIdx = i;

            for(int j=i+1; j<arr.length-1; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        for(int i: arr) {
            System.out.print(i + " ");
        }

    }

}



