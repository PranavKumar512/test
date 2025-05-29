package recursions;

public class ReverseString {

    public static void reverseString(String str, int len) {
        if (len == 0) {
            System.out.print(str.charAt(len));
            return;
        }
        System.out.print(str.charAt(len));
        reverseString(str, len - 1);

    }

    /*
    public static String reverseString(String str, int len) {
        if(len == 0) {
            return String.valueOf(str.charAt(len));
          }

         return str.charAt(len) + reverseString(str, len-1);

        }
    */


    public static void main(String[] args) {
        String str = "abc";
        int len = str.length() - 1;

        reverseString(str, len);
    }
}
