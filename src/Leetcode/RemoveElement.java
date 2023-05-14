package Leetcode;

import java.util.Arrays;

class RemoveElement {
    public static void main(String[] args) {
        //int[] nums = {0,1,2,2,3,0,4,2};
        int[] nums = {3,2,2,3};

        removeElement(nums,3);
    }

    public static int removeElement(int[] nums, int val) {

        int n = nums.length;
        int counter=0;
        //Arrays.sort(nums);

//        for(int i=0; i<n; i++)
//        {
//            if(nums[i]==0)
//                zeros++;
//        }



        for (int i=0; i<n; i++)
        {
            if(nums[i]!=val)
            {
                nums[counter]=nums[i];
                counter++;
            }
        }


//        for(int i=0; i<newNums.length; i++)
//        {
//            if(newNums[i]!=0)
//            {
//                k++;
//            }
//        }

        System.out.println(counter +" "+Arrays.toString(nums));
        return counter;
    }
}