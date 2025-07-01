package recursions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
       int n = 10;
       List<String> combinations = generateParenthesis(n);

       for(String s: combinations) {
           System.out.println(s);
       }

    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack(result, "", 0, 0, n);
        return result;
    }
    public static void backtrack(List<String> result, String current, int open, int close, int max) {

        if(current.length() == max*2) {
            result.add(current);
            return ;
        }

        // add open (
        if(open < max) {
            backtrack(result, current+"(", open+1, close, max);

        }

        // add close )
        if(close < open) {
            backtrack(result, current+")", open, close+1, max);

        }

    }
}
