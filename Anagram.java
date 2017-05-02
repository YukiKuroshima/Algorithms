
public class Anagram {
	public static int numberNeeded(String first, String second) {
		int counter = 0;
		String original = first;
		while (true) {
			char c = original.charAt(counter);
			int indexOfChar = second.indexOf(c);
			System.out.println("Counter: " + counter + "indexOfChar: " + indexOfChar + "first: " + first + " second: "
					+ second + " ori: " + original);
			if (-1 != indexOfChar) { // hits
				int charIndex = first.indexOf(c);
				first = first.substring(0, charIndex) + first.substring(charIndex + 1);
				second = second.substring(0, indexOfChar) + second.substring(indexOfChar + 1);
			}
			counter++;
			if(first.isEmpty() || second.isEmpty() || counter >= original.length()) break;
		}
		return first.length() + second.length();
	}

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// String a = in.next();
		// String b = in.next();
		System.out.println(numberNeeded("cde", "abc"));
	}
}
