package Leetcode.String;
/*
Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
 */
public class MaximumNumberOfWordsFoundInSentence {

    public static void main(String[] args) {
        MaximumNumberOfWordsFoundInSentence m = new MaximumNumberOfWordsFoundInSentence();
        String[] s = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(m.mostWordsFound(s));
    }
    public int mostWordsFound (String[] sentences)
    {
        int max=0;

        for (int i=0; i<sentences.length; i++)
        {
            int count=1;
            String currentWord = sentences[i];
            for(int j=0; j<currentWord.length();  j++)
            {
                if(currentWord.charAt(j)==' ')
                {
                    count++;
                }
            }

             max = Math.max(max,count);
        }
        return max;
    }
}
