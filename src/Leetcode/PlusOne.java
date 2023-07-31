package Leetcode;

import java.util.Arrays;

/*
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */
public class PlusOne {

    public static void main(String[] args) {

        int [] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {

//     int lastIndex = digits.length-1;
//     int lastDigit = digits[lastIndex];
//
//     if (lastDigit!=9)
//     {
//         digits[lastIndex]++;
//     }
//     else
//     {
//         digits = new int[digits.length+1];
//         digits[lastIndex]=0;
//         digits[lastIndex-1]=1;
//     }
//
//        return digits;
//
//    }

        int n=digits.length;

        for (int i=n-1; i>=0; i--)
        {
            if (digits[i]<9)
            {
                digits[i]++;
                return digits;
            }

            digits[i]=0;
        }

        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}


