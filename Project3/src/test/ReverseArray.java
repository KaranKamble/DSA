package test;

import java.util.Arrays;

public class ReverseArray {

    private static void reverseArray(int[] arr) {
        int i=0, j=arr.length-1;

        while ( i < j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 12, 1, 9, 9, 21, 7, 9, 17, 7 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }


}
