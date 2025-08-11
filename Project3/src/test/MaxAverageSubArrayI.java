package test;

public class MaxAverageSubArrayI {

    public static double findMaxAverage(int[] arr, int k) {

        int wSum=0;


        for (int i = 0; i < k; i++) {
            wSum = wSum + arr[i];
        }

        int cSum = wSum;

        for (int i = k; i < arr.length; i++) {
            wSum = wSum - arr[i-k] + arr[i];
            cSum = Math.max(wSum, cSum);

        }
        return (double) cSum/k;
    }

    public static void main(String[] args) {
        int[] arr = { 1,12,-5,-6,50,3};
        int k= 4;

        System.out.println(findMaxAverage(arr, k));
    }
}
