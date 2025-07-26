package test;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    private static void removeDuplicateFromSortedArray(int[] arr) {

        int rd=0;
        //  1, 1, 7, 9, 9, 9, 12, 17, 21
        for (int i = 1; i <arr.length; i++) {

            if( arr[rd] != arr[i]){
              rd++;
              arr[rd] = arr[i];
            }
        }

        for (int i = 0; i <= rd ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 1, 7, 7, 9, 9, 9, 12, 17, 21};
        removeDuplicateFromSortedArray(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }


}
