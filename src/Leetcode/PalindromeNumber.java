package Leetcode;

import java.util.Scanner;
/*
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(Ispalindrom(-121));
    }

    public static boolean Ispalindrom(int x)
    {
        int rev=0;
        int original = x;

        while(x>0)
        {
           rev = x%10 + rev*10 ;
           x = x/10;
        }

        if (rev == original)
        {
            return true;
        }
        else return false;
    }
}
