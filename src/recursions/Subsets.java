package recursions;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        printSubsets(arr, ans, 0);

    }

    public static void printSubsets(int[] arr, ArrayList<Integer> ans, int i) {

        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        ans.add(arr[i]);
        printSubsets(arr, ans, i + 1);
        ans.removeLast();
        printSubsets(arr, ans, i+1);

    }
}
