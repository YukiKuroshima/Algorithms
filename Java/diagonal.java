import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class diagonal {

    public static int solution(int [][] a, int n) {
        int p = 0;
        int s = 0;
        for(int i = 0; i < n; i++) {
            p+=a[i][i];
        }
        for(int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            s+=a[i][j];
        }
        return Math.abs(p - s);
    }
}
