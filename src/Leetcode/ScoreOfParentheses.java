package Leetcode;

import java.util.HashMap;
import java.util.Stack;

/*
Example 1:
Input: s = "()"
Output: 1

Example 2:
Input: s = "(())"
Output: 2

Example 3:
Input: s = "()()"
Output: 2
 */
public class ScoreOfParentheses {

    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("(()(()))"));
    }
    public static int scoreOfParentheses(String s) {
        int count=0;
        //let's create a stack character integer to store count value;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            Character c = s.charAt(i);
            if(c=='(')
            {
                st.push(count);
                count=0;
            }
            else{
                count = st.pop() + Math.max(count*2,1);
            }

        }

        return count;
    }

//    public static void recurse(String s, int index, int count)
//    {
//        if(s.length()==index)
//        {
//            return;
//        }
//
//        if(index<s.length()&& s.charAt(index)=='(')
//        {
//            recurse(s,index+1,count);
//        }
//        if(index<s.length() && s.charAt(index)==')')
//        {
//            recurse(s,index+1,count+1);
//        }
//    }
}
