package test;

public class Program {

//	2. "Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.
//
//	Example:
//	String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
//	String toSearch = ""ODG"";
//
//	Returns 9 (LODGESSSS)"
	
	public static int longestWordWithSubstring(String[] dict, String toSearch) {
        if (dict == null || dict.length == 0 || toSearch == null || toSearch.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        String toSearchLower = toSearch.toLowerCase();

        for (String word : dict) {
            if (word.toLowerCase().contains(toSearchLower)) {
                maxLength = Math.max(maxLength, word.length());
            }
        }

        return maxLength;
    }


	public static void main(String[] args) {
		
		String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
		String toSearch = "ODG";
		
		System.out.println(longestWordWithSubstring(dict, toSearch));
	}
}
