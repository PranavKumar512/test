package recursions;

public class Fibonacci {

    public static void fibonacci(int n, int i , int a, int b) {
        if(i == n-2) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci( n,i+1, b, c);
    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibonacci(7, 0, 0, 1);
    }
}
