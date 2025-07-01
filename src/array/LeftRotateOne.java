package array;

public class LeftRotateOne {
    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 5, 2, 3, 1};

        int temp = arr[0];
        for (int i = 1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}
