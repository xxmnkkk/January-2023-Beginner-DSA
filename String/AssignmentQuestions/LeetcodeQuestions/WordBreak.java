package String.AssignmentQuestions.LeetcodeQuestions;

import java.util.List;
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int sLength = s.length();
        boolean result[] = new boolean[sLength + 1];
        result[0] = true;

        for(int end = 1; end <= sLength; end++) {
            for(int start = 0; start < end; start++) {
                String subString = s.substring(start, end);
                
                if(result[start] && wordDict.contains(subString)) {
                    result[end] = true;
                    break;
                }
            }
        }

        return result[sLength];
    }
}
