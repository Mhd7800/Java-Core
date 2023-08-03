package Leetcode;

import java.util.*;

/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfSubString(s));
    }
    public static int lengthOfSubString(String s) {

        //1st approach : brut force with two loops
        int max=0;
        for (int i=0; i<s.length(); i++)
        {
            Stack<Character> str = new Stack<>();
            str.push(s.charAt(i));
            for(int j=i+1; j<s.length(); j++)
            {
                Character c = s.charAt(j);

                if(str.contains(c)){
                    max = Math.max(max,str.size());
                    str.clear();
                    break;
                }
                else
                {
                    str.push(c);
                }
            }
        }

        return max;

    }

}