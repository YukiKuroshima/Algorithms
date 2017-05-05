import java.util.*;

public class WordMatch {
	String[] noteArray;
	String[] magazieArray;

	public WordMatch(String magazine, String note) {
		noteArray = note.split(" ");
		magazieArray = magazine.split(" ");
		Arrays.sort(noteArray);
		Arrays.sort(magazieArray);
	}

	public boolean solve() {
		if (noteArray.length > magazieArray.length) {
			return false;
		}

		int nateCounter = 0;
		int magazineCounter = 0;
		while (nateCounter < noteArray.length && magazineCounter < magazieArray.length) {
			if (noteArray[nateCounter].equals(magazieArray[magazineCounter])) {
				nateCounter++;
				magazineCounter++;
			} else {
				magazineCounter++;
			}
		}
		if (nateCounter == noteArray.length && magazineCounter <= magazieArray.length) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// int m = scanner.nextInt();
		// int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		// scanner.nextLine();

		WordMatch s = new WordMatch("give me one grand today night", "give one grand today");
		// scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
