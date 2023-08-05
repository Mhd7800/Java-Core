package Leetcode;
import java.util.HashMap;
import java.util.Map;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
/*
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        r.romanToInt("MCMXCIV");
    }
    public int romanToInt(String s) {

        //let's define our own rule
        /*
        CM = A = 900
        XC = B = 90
        IV = E =  4
        IX = F = 9
        XL= G = 40
        CD = H = 400
         */
        s= s.replace("CM","A").replace("XC","B").replace("IX","F")
                .replace("IV","E").replace("XL","G").replace("CD","H");


        HashMap<Integer,Character> map = new HashMap<>();

        map.put(1,'I');
        map.put(5,'V');
        map.put(10,'X');
        map.put(50,'L');
        map.put(100,'C');
        map.put(500,'D');
        map.put(1000,'M');
        map.put(900,'A');
        map.put(90,'B');
        map.put(4,'E');
        map.put(9,'F');
        map.put(40,'G');
        map.put(400,'H');

        int number = 0;
        for (int i=0; i<s.length(); i++)
        {
           number +=getKeyByValue(map, s.charAt(i));
        }

        System.out.println(number);
        return number;
    }

    public static int getKeyByValue(Map<Integer, Character> map, char value) {
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        // If the value is not found, you might return a default value or throw an exception
        return -1; // Default value if 'I' is not found
    }
}
