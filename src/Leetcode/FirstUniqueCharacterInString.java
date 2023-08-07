package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("loveleetcode"));
    }
    public int firstUniqChar(String s)
    {
       int index = -1;
       for(int i=0; i<s.length(); i++)
       {
           if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
               return i;
       }

      return -1;
    }
}
