package Stack.LeetcodeQuestions;

import java.util.Stack;

public class MaximumNestingDepthOfTheParenthesesWithoutStack {
    public int maxDepth(String s) {
        int currentCount = 0, maxCount = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            }
            else if(ch == ')'){
                currentCount--;
            }
            else {

            }
        }

        return maxCount;
    }
}
