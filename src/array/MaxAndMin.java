package array;

public class MaxAndMin {
    public static void main(String[] args) {

        int[] arr = {5, 9, 4, 5, 2, 3, 1};

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i< arr.length ;i++) {
            if (arr[i] > max) {
               max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("max: " + max + " min: " + min);
    }
}
