package practice1;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        List<List<Integer>>  ans = combinationSum(arr, target);
        System.out.println(ans);

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> combination = new ArrayList<>();
       backtrack(candidates, 0 ,combination, ans, target);
       return ans;
    }

    public static void backtrack(int[] arr, int idx, List<Integer> combination, List<List<Integer>> ans, int target) {
       if(target < 0) {
           return;
       }
       if (target == 0) {
           ans.add(new ArrayList<>(combination));
           return;
       }

       for (int i=idx; i< arr.length; i++) {
           combination.add(arr[i]);
           backtrack(arr, i, combination, ans, target - arr[i]);
           combination.removeLast();
       }
    }
}






