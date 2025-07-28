package test;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingElement {

    private static void findFirstNonRepeatingElement(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        for( int n : arr ){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }

        for (int n : arr ){
            if (freq.get(n) == 1 ){
                System.out.println(n);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 12, 1, 9, 9, 12, 6, 9, 1, 7 };
        findFirstNonRepeatingElement(arr);
    }


}
