import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            String temp = s.charAt(i) + "";
            String s2 = s.replaceFirst(temp, "");
            
            if(!s2.contains(temp)){
                answer += temp;    
            } 
        }
        char[] array = answer.toCharArray();
        Arrays.sort(array);
        return String.valueOf(array);
    }
}