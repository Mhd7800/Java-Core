package Leetcode.String;
/*
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }
    public static boolean isPalindrome(String s) {

        StringBuilder clean = new StringBuilder();
        //remove all non alpha-numeric characters | ascii characters lowercase characters are between 97--122

        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            //check if it's a regular character or alpha non-numeric
            if((c >= 'a' && c <= 'z') || (c>='0' && c<='9'))
            {
                clean.append(Character.toLowerCase(c));
            }
        }

        System.out.println(clean);

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }


        return true;
    }
}
