package array;

public class Reverse {

    public static void main(String[] args) {

        int[] arr = {5, 9, 4, 5, 2, 3, 1};
        int l = 0;
        int r = arr.length-1;

        while(l<r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++ ;
            r-- ;
        }

        for(int i: arr) {
            System.out.print(i);
        }
    }

}
