import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = sc.nextLine();
        String reversed = "";


        //Using simple for loop

//        for (int i =s.length()-1; i>=0; i--) //i=2 ;
//            {
//                reversed = reversed + s.charAt(i);
//            }
//
//        System.out.println(reversed);


        //Using char string and for loop

        char[] a = s.toCharArray();
        String rev="";
        for (int i=a.length-1; i>=0; i--)
        {
           rev = rev+a[i];
        }
        System.out.println(rev);


    }
}
