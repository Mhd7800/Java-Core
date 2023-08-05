package Leetcode;
/*
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class TImeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] price = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
    public static int maxProfit(int[] price)
    {
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<price.length; i++)
        {

            if (price[i]<min)
            {
                min = price[i];
            }

            //compare if index of max is bigger than index of min then return max-min else return 0


        }

        return max-min;
    }
}
