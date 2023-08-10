package Leetcode;
/*
Example 1:
Input: "112358"
Output: true
Explanation:
The digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8

Example 2:
Input: "199100199"
Output: true
Explanation:
The additive sequence is: 1, 99, 100, 199.
1 + 99 = 100, 99 + 100 = 199
 */
public class AdditivieNumber {
    public static void main(String[] args) {
        AdditivieNumber a = new AdditivieNumber();
        System.out.println(a.isAdditiveNumber("199100199"));
    }

    public  boolean isAdditiveNumber(String num)
    {

         recurse("199100199",0,1,2,false);
        return true;
    }

    void recurse(String num, int left, int right, int current, boolean flag)
    {
        char c = num.charAt(current);
        char a = num.charAt(current-1);
        char b = num.charAt(current-2);
        int currentNumber = Character.getNumericValue(c);
        int doubleDigit = Character.getNumericValue(c)+Character.getNumericValue(num.charAt(current)+1);
        left = Character.getNumericValue(a);
        right = Character.getNumericValue(b);

        if(current==num.length()-1)
        {
            return;
        }

        if(left+right!=currentNumber)
        {
            recurse(num,left+1,right+1,current+1,flag);
            return;
        }
        if(left+right!=doubleDigit)
        {
            recurse(num,left+1,right+1,current+1,flag);
            return;
        }

    }

    //first way, do it with iterative function
    /*
    public static boolean isAdditiveNumber(String num) {

        if(num.length()<3)
        {
            return false;
        }

        for(int i=2; i<num.length(); i++)
        {
          char c = num.charAt(i);
          char a = num.charAt(i-1);
          char b = num.charAt(i-2);
          int currentNumber = Character.getNumericValue(c);
          int left = Character.getNumericValue(a);
          int right = Character.getNumericValue(b);
            System.out.println("left: "+left+"right: "+right+"currentNumber: "+currentNumber);

          if(left+right==currentNumber)
          {
              continue;
          }
          else {
              return false;
          }
        }

        return true;
    }
*/
}

