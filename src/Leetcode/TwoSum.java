package Leetcode;

import java.util.Arrays;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


 */
public class TwoSum {
     public static void main(String[] args) {
         int [] nums = {3,3};
         int[] result = TwoSum(nums,6);
         System.out.println(Arrays.toString(result));
    }
    public static int[] TwoSum(int arr[], int target)
    {
        int sum[]= new int[2];
        for (int i=0; i<arr.length-1; i++)
        {
            for (int j=1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    sum[0] = i;
                    sum[1]= j;
                }
            }
        }

        return sum;
    }
}
