package Stack.LeetcodeQuestions;

import java.util.Stack;

public class MaximumNestingDepthOfTheParenthesesUsingStack {
    public int maxDepth(String s) {
        int currentCount = 0, maxCount = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                stack.push(ch);
                currentCount = stack.size();
                maxCount = Math.max(maxCount, currentCount);
            }
            else if(ch == ')'){
                stack.pop();
            }
            else {

            }
        }

        return maxCount;
    }
}
