package practice1;

import java.util.ArrayList;

public class Subsets {
    public static void subsets(int[] arr, ArrayList<Integer> ans, int i) {
        if(i == arr.length) {
            System.out.println(ans);
            return;
        }

        ans.add(arr[i]);
        subsets(arr, ans, i+1);
        ans.removeLast();
        subsets(arr, ans, i+1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> ans =  new ArrayList<>();
        subsets(arr, ans, 0);
    }
}






