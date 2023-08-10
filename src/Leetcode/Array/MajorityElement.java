package Leetcode.Array;
/*
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2,1,1};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {

        //find the majority element, how to approach ?
        //take the element, compare it with the other if it is the same add the counter
        //then check the condition greater than n/2 and return the counter.
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            int counter =0;
            int current = nums[i];
            for (int j = 0; j < n; j++) {
                if(current==nums[j])
                {
                    counter++;
                    if(counter>n/2)
                    {
                        return current;
                    }
                }
            }
        }

        return 0;

        // The simplest and best appoach
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];

    }
}
