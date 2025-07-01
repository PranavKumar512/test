package practice1;

public class Permutations {

    public static void permutations(int idx, String str, String  perm) {

        if(str.isEmpty()) {
            System.out.println(perm);
            return;
        }

        for (int i=0; i< str.length(); i++) {
            char curr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            permutations(i+1, newString, perm+curr);
        }
    }

    public static void main(String[] args) {
        permutations(0, "ABC", "");
    }
}
