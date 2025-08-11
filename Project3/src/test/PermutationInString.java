package test;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Map[i] == s2Map[i])
                matches++;
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == 26) return true;

            int index = s2.charAt(r) - 'a';
            s2Map[index]++;
            if (s2Map[index] == s1Map[index]) {
                matches++;
            } else if (s2Map[index] - 1 == s1Map[index]) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            s2Map[index]--;
            if (s2Map[index] == s1Map[index]) {
                matches++;
            } else if (s2Map[index] + 1 == s1Map[index]) {
                matches--;
            }

            l++;
        }

        return matches == 26;
    }

    public static void main(String[] args) {
        String s1 = "ob";
        String s2 = "eidboaoo";

        boolean result = checkInclusion(s1, s2);
        System.out.println("Does s2 contain a permutation of s1? --> " + result);
    }
}
