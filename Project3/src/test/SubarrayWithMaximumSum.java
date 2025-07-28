package test;

public class SubarrayWithMaximumSum {

    private static void subarrayWithMaximumSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start =0;
        int end = 0;
        int initStart = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            if( sum > maxSum ) {
                maxSum = sum;
                start = initStart;
                end = i;
            }

            if( sum < 0){
                sum = 0;
                initStart = i+1;
            }
        }

        for (int i = start; i <= end; i++) {
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
        System.out.println("maxSum : "+maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        subarrayWithMaximumSum(arr);
    }


}
