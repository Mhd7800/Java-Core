package Leetcode.String;

/*
Counting the last word
Leetcode Exercise
-First we trim the string , it will remove the leading and tail space ,
so that the last word is accessible is directly accessible from last index
after that if we encouter a space we get out of the loop

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/

class LengthOfLastWord {
    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {

        int count=0;
        String trimmed = s.trim();

        for (int i=trimmed.length()-1; i>=0; i--)
        {
            System.out.println(trimmed.charAt(i));
            if (trimmed.charAt(i)!=' ')
            {
                count++;
            }
            else
                break;
        }

        return count;
    }
}