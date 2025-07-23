package test;

public class Program {

//	1. "Convert a string as given in the format below:
//
//	Example:
//	aabbb into a2b3
//	aaaa into a4
//	a into a1"
//	Run Length Encoding

	public static String operation(String s) {
		int n = s.length();
		if (n == 0)
			return "";

		StringBuilder result = new StringBuilder();
		int count = 1;

		for (int i = 1; i < n; i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				result.append(s.charAt(i - 1)).append(count);
				count = 1;
			}

		}

		// Append last character and its count
		result.append(s.charAt(n - 1)).append(count);

		return result.toString();
	}

	public static void main(String[] args) {

		System.out.println(operation("aabbb"));
	}

}
