package test;

import java.util.Arrays;

public class BubbleSort {

    private static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {

                    if( arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 12, 1, 9, 9, 21, 7, 9, 17, 7 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
