package Leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,6};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int counter=1;
        int n = nums.length;
        int[] newNums = new int[n];


            for(int j=0; j<=n-1; j++)
            {
                if(nums[j]!=nums[j+1])
                {
                    nums[counter]=nums[j+1];
                    counter++;
                }
            }


        System.out.println(Arrays.toString(nums));

        return counter;
    }
}
