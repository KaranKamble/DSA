package test;

public class KthLargeAndSmallElement {

    private static void kthLargeAndSmallElement(int[] arr, int k) {

        int small = arr[k-1];
        int large = arr[arr.length-k];

        System.out.println(small+" "+large);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 7, 7, 9, 9, 9, 12, 17, 21};
        kthLargeAndSmallElement(arr,2);
    }


}
