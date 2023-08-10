package Leetcode;

public class Training {
    public static void main(String[] args) {
        String haystack ;
        String needle ;
        System.out.println(strStr("sadbutsad","sad"));
    }
    public static int strStr(String haystack, String needle) {
        int index=0;
        for (int i=0; i<haystack.length() && i<needle.length(); i++)
        {
            if (haystack.charAt(i)==needle.charAt(i))

                index = i;

            else
                break;
        }

        return index;
    }
}
