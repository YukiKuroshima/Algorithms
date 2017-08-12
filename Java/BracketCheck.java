import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BracketCheck {

    public static boolean isBalanced(String expression) {
        int size = expression.length();
        if(size % 2 == 1) return false;
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < size; i++){
            char c = expression.charAt(i);
            if(c == '('){
                s.push(')');
            } else if(c == '{'){
                s.push('}');
            } else if(c == '['){
                s.push(']');
            }else if (s.isEmpty()){
                return false;
            } else if(c == s.peek()){
                s.pop();
        }

        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
