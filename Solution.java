import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0, j = n - 1; a_i < n; a_i++, j--) {
            a[a_i] = in.nextInt();
            // sorting
            Arrays.sort(a);
            // 0, 0, 0, 0, ....
            if (j % 2 == 0) { // for 8, 6, 4, 
                // there are two medians exists.
                System.out.println((a[a_i / 2 + j]+a[a_i / 2 + j-1])/2.0);
            } else { //for 9, 7, 5, 3...
                // the median is only one val
                // System.out.println(a[a_i / 2 + j]);
                System.out.println(a_i / 2 + j);
            }
        }
    }
}