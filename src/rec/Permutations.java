package rec;

public class Permutations {

    public static void main(String[] args) {
        printPermutations(0, "ABC", "");
    }

    public static void printPermutations(int idx, String str, String perm) {

        if(str.isEmpty()) {
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<str.length(); i++) {
            char curr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutations(i+1, newString, perm+curr);
        }
    }


}
