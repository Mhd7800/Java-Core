package Leetcode.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/*
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
 */
public class GenerateParanthesis {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
        public static List<String> generateParenthesis(int n) {

            List<String> myList = new ArrayList<>();
            recurse(myList,0,0,"",n);
            return myList;
        }

            public static void recurse(List<String> myList, int openCount,int closeCount,String s ,int n)
            {
                if(s.length()==n*2){
                    myList.add(s);
                    return;
            }
                if(openCount <n)
                {
                    recurse(myList,openCount+1, closeCount,s+"(", n);
                }

                if(closeCount<openCount)
                {
                    recurse(myList,openCount, closeCount+1, s+")",n);
                }

        }
}
