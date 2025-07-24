package test;

import java.util.Arrays;
    // Time complexity : O(m+n)
public class FindMedian {

    private static float findMedian(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k <= arr3.length/2) {

            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length && k <= arr3.length/2 ) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length && k <= arr3.length/2 ) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.printf(Arrays.toString(arr3));

        if( arr3.length % 2 == 0 ){

            int mid = arr3.length/2;
            return (float)(arr3[mid] + arr3[mid-1])/2;
        }else {
            int mid = arr3.length / 2;
            return arr3[mid];
        }
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 8};
        int arr2[] = {10, 12, 14, 16, 18, 20};

        float m = findMedian(arr1, arr2);
        System.out.println(m);
    }


}
