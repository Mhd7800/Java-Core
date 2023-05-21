package Leetcode;

import java.util.Arrays;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {
        int counter =0;
        char a=' ';
        String newStr;
        int n= strs.length;



        for (int i=1; i< n; i++)
        {
            String temp=strs[0];
            String temp1=strs[i];

            for(int j=0; j<temp.length() && j<temp1.length(); j++)
            {

                if (temp.charAt(counter)==temp1.charAt(counter)) {
                    counter++;
                }
                else
                {
                    newStr="";
                    break;
                }
            }
        }

        newStr = strs[0].substring(0,counter);

        System.out.println(newStr);


        return "";
    }
    public static void main(String[] args) {

        String [] str = {"flow","flower","flight"};
        longestCommonPrefix(str);
    }
}
