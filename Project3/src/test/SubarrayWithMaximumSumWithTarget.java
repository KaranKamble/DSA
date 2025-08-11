package test;

public class SubarrayWithMaximumSumWithTarget {

    private static int subarrayWithMaximumSum(int[] arr, int k) {

        int wSum =0;
        int cSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            wSum = wSum + arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            wSum = wSum - arr[i-k] + arr[i];
            cSum= Math.max(wSum, cSum);
        }

        return cSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 31, -4, 21, 7};
        int k=3;

        System.out.println(subarrayWithMaximumSum(arr,k));
    }


}
