class Solution {
    public static void main(String[] args) {
         lengthOfLastWord("Bonjour monsieur ");
    }
    public static int lengthOfLastWord(String s) {
        int counter=0;
        String str=s.trim();
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