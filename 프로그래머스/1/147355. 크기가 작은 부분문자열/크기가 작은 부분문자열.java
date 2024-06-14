import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        
        for(int i = 0; i < t.length() - pLength+1; i++){
            String subString = t.substring(i,i+pLength);
            // System.out.println(subString);
            if(Long.valueOf(subString) <= Long.valueOf(p)){
                answer += 1;
            }      
        }
        return answer;
    }
}