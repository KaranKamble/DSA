package test;

import java.util.Arrays;

public class MoveAllZerosToEndOfTheArray {

    private static void moveAllZerosToEndOfTheArray(int[] arr) {
        int z=0;
        int nz=0;
        // 0, 1, 0, 9, 21, 0, 9, 0, 7
        while( nz < arr.length ){
            if( arr[nz] != 0 ){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                z++;
                nz++;
            }else
                nz++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 0, 1, 0, 9, 21, 0, 9, 0, 7 };
        moveAllZerosToEndOfTheArray(arr);

        System.out.println(Arrays.toString(arr));

    }

}
