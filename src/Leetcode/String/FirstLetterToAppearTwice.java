package Leetcode.String;

public class FirstLetterToAppearTwice {

    public static void main(String[] args) {

        System.out.println(repeatedCharacter("abccbaacz"));
    }

    public static char repeatedCharacter(String s) {

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(s.indexOf(c)!=i)
            {
                return c;
            }

            //System.out.println(s.indexOf(c)+"--"+lastIndexValue+"--"+s.lastIndexOf(c));
        }

        return ' ';

    }
}
