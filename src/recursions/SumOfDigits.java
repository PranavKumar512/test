package recursions;

public class SumOfDigits {

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);

    }

    public static void main(String[] args) {
        int sum = sumOfDigits(24);
        System.out.println(sum);
    }

}