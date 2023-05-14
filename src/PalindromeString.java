public class PalindromeString {
    public static void main(String[] args) {

        String s = "madan";
        String rev = "";


        //First way , reverse the string and check it
        for (int i = s.length()-1; i>=0; i--)
        {
            rev = rev+ s.charAt(i);
        }

        System.out.println("rev :"+rev);
        System.out.println("s:"+s);
        if (s.equals(rev))
        {
            System.out.println("It's palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }



    }
}
