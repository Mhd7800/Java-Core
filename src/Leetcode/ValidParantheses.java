package Leetcode;

import java.util.HashMap;
import java.util.Stack;

/*
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */
public class ValidParantheses {

    public static void main(String[] args) {

        ValidParantheses v = new ValidParantheses();
        System.out.println(v.isValid("[]{{"));
    }
    public boolean isValid(String s)
    {
        int n = s.length();

        Stack<Character> st = new Stack<Character>();

        for (int i=0; i<n; i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.empty())
                {
                    return false;
                }

                 if ((s.charAt(i)!=']' && st.peek()!='[') || (s.charAt(i)!='}' && st.peek()!='{') ||  (s.charAt(i)!=')' && st.peek()!='('))
                 {
                     return false;
                 }
            }
        }

        return st.empty();
    }
}
