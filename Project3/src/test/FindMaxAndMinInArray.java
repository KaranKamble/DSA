package test;

public class FindMaxAndMinInArray {

    private static void findMaxAndMinInArray(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for( int element : arr ){

            if( element < min)
                min = element;
            else if (element > max)
                max = element;

        }

        System.out.println(min +" "+max);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 12, 1, 9, 9, 21, 7, 9, 17, 7 };
        findMaxAndMinInArray(arr);
    }


}
