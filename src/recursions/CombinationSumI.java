package recursions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 1};
        int target = 7;
        List<Integer> combination = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(arr, 0, combination, ans, target);


    }

    public static void combinationSum(int[] arr, int idx, List<Integer> combination, List<List<Integer>> ans, int target) {

        if (idx == arr.length || target < 0) {
            return;
        }
        if (target == 0) {
            System.out.println(combination);
            ans.add(combination);
            return;
        }
        combination.add(arr[idx]);
        // single choice
        combinationSum(arr, idx + 1, combination, ans, target - arr[idx]);
        // multiple choice
        combinationSum(arr, idx, combination, ans, target - arr[idx]);
        //exclusion
        combination.removeLast();
        combinationSum(arr, idx + 1, combination, ans, target);
    }
}
