package test;

public class FindMissingNumberInRange {

    private static void findMissingNumberInRange(int[] arr) {
        int n = arr.length+1;

        int expected = n *(n+1)/2;
        int actual = 0;
        for( int num : arr ){
            actual = actual + num;
        }

        System.out.println(expected-actual);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        findMissingNumberInRange(arr);
    }
}
