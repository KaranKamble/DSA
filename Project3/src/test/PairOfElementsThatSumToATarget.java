package test;

import java.util.HashMap;
import java.util.Map;

public class PairOfElementsThatSumToATarget {

    private static void pairOfElementsThatSumToATarget(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int n : arr){
            int rem = k - n;
            if( map.containsKey(rem)){
                System.out.println(rem+" "+n);
            }

            map.put(n,index);
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        pairOfElementsThatSumToATarget(arr, 7);
    }


}
