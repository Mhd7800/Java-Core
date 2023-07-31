package Leetcode;

import java.util.Arrays;
/*
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,8,10};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k=0;

      //create a new array with the same size as nums
        int[] newNums = new int [nums.length];

        //Let's create a loop to go through nums array
        for (int i=0; i<nums.length-1; i++)
        {
            if (nums[i]==nums[i+1])
            {
                newNums[i]=nums[i+1];
                k++;
            }
        }

        return k;
    }
}

/*
  int counter=1;
        int n = nums.length;

            for(int j=0; j<n-1; j++)
            {
                if(nums[j]!=nums[j+1])
                {
                    nums[counter]=nums[j+1];
                    counter++;
                }
            }

        System.out.println(Arrays.toString(nums));

        return counter;
 */