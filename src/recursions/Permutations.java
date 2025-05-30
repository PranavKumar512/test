package recursions;

public class Permutations {
    public static void main(String[] args) {
        PrintPermutations permutations = new PrintPermutations();
        permutations.printPerm("ABC", 3, "");
    }
}

class PrintPermutations {

    public void printPerm(String str, int n, String perm) {
        if( n==0 ) {
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<n ; i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr,n-1 ,perm+currChar);
        }
    }
}
