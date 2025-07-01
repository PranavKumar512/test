package practice1;

public class ReverseString {

    public static void reverseStr(String s, int len) {
        if (len == 0) {
            System.out.print(s.charAt(len));
            return;
        }

        System.out.print(s.charAt(len));
        reverseStr(s, len - 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        int len = str.length()-1;
        reverseStr(str, len);
    }
}
