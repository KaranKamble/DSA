package test;

public class BinarySearch {

    private static int binarySearch(int[] arr, int key) {
        int left=0, right=arr.length-1, mid=0;

        while ( left <= right ){
            mid = (left + right)/ 2;

            if( arr[mid] == key )
                return mid;
            else if ( key > arr[mid])
                left = mid +1;
            else
                right = mid -1;
            }

        return  -1;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9 };
        System.out.println(binarySearch(arr, 9));

    }
}
