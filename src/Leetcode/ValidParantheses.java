package Leetcode;
import java.util.Stack;
public class ValidParantheses {
    public static void main(String[] args) {
        ValidParantheses v = new ValidParantheses();
        System.out.println(v.isValid("()"));
    }

    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.empty()) {
                    return false;
                }
                char top = st.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.empty();
    }
}
