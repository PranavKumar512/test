package array;

public class LeftRotateArrayByk {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 10;
        rotate(arr, k, n);
    }

    public static void rotate(int[] arr, int k, int n) {
        int d = k % n;
        for(int i = n-d; i< n; i++) {
            System.out.println(arr[i]);
        }
        int[] temp = new int[d];

        for(int i = 0; i<d; i++) {
           temp[i] = arr[i];
        }

        for(int i = d; i < n; i++) {
            arr[i - d ] = arr[i];
        }

        for(int i = 0; i< d ; i++) {
            arr[n -d +i] = temp[ i];
        }
//
//        for (int i: arr) {
//            System.out.println(i);
//        }


    }
}
