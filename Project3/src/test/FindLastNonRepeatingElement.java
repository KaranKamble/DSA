package test;

import java.util.HashMap;
import java.util.Map;

public class FindLastNonRepeatingElement {

    private static void findLastNonRepeatingElement(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        for( int n : arr ){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }

        for (int i = arr.length-1; i >= 0 ; i--) {
            if( freq.get(arr[i]) == 1 ){
                System.out.println(arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 12, 1, 9, 9, 12, 6, 9, 1, 7 };
        findLastNonRepeatingElement(arr);
    }


}
