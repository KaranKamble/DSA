package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    private static void firstNonRepeatingChar(String str1) {

        Map<Character, Integer> freq = new LinkedHashMap<>();
        char[] arr = str1.toCharArray();

        for( char ch : arr ){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        for ( char ch : arr ){
            if( freq.get(ch) == 1 ){
                System.out.println(ch);
                return;
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "11232345";
        firstNonRepeatingChar(str1);

    }


}
