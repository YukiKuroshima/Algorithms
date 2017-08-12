import java.util.Arrays;
import java.util.Scanner;

public class ArrayShiftLeft {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int[] newArray = Arrays.copyOf(a, n);
		int newArrayIndex = k;
		for (int i = n-1; i >= 0; i--) {
			if (i>=k) {
				newArray[i-k] = a[i];
				System.out.println(a[i] + "first i:" + i + "k+i" + (k - i));
			} else {
				System.out.println(a[i] + "second");
				newArray[i+n-k] = a[i];
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//int n = in.nextInt();
		//int k = in.nextInt();
		//int a[] = new int[n];
		//for (int a_i = 0; a_i < n; a_i++) {
		//	a[a_i] = in.nextInt();
		//}

		int[] output = {1, 2, 3, 4, 5};
		int n = 5;
		output = arrayLeftRotation(output, 5, 4);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}
