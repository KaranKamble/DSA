package test;

import java.util.Arrays;

public class InsertionSort {

    private static void insertionSort(int[] arr) {

        for (int i = 0; i <arr.length-1; i++) {

            for (int j = 1+i; j < arr.length; j++) {
                if( arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 12, 1, 9, 9, 21, 7, 9, 17, 7 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
