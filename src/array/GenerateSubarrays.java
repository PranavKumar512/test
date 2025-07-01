package array;

public class GenerateSubarrays {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) start = i;
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        String s = "aabbccdd";
        System.out.println(s.charAt(1+3));

//        System.out.println(maxSum);
//        System.out.println(start);
//        System.out.println(end);
    }
}
