package Leetcode.String;
/*
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {

        //we check to see if s is within t respecting the charater sequence

        //if s is empty it is definitely a subsequence
        if(s.length()==0) return true;

        int s_pointer=0;
        int t_pointer =0;
        // we loop all of t looking for the characters of s
        while(t_pointer<t.length())
        {
            if(t.charAt(t_pointer)==s.charAt(s_pointer))
            {
                s_pointer++;
                if(s_pointer==s.length()) return true;
            }

            t_pointer++;
        }


        return false;
    }
}
