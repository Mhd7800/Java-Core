package Leetcode;

/*
Counting the last word
Leetcode Exercise
-First we trim the string , it will remove the leading and tail space ,
so that the last word is accessible is directly accessible from last index
after that if we encouter a space we get out of the loop
*/

class LengthOfLastWord {
    public static void main(String[] args) {
         lengthOfLastWord("Bonjour monsieur");
    }
    public static int lengthOfLastWord(String s) {
        int counter=0;
        String str=s.trim(); //
        int n = str.length();
        for(int i=n-1; i>=0; i--)
        {
            if(str.charAt(i)!=' ')
            {
                counter++;
            }
            else {
                break;
            }
        }

        System.out.println(counter);
        return counter;

    }
}