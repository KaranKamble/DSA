package test;

public class LinearSearch {
    private static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == key )
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 1, 9, 5 };

        System.out.println(linearSearch(arr, 9));
    }


}
