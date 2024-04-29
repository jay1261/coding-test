import java.util.*;
class Solution {
    public int solution(String my_string) {
        String reg = "[^0-9]";
        String joined =  String.join("",my_string.replaceAll(reg, " ").split(" "));
        
        int answer = 0;
        for(int i = 0; i < joined.length(); i++){
            String temp = joined.charAt(i) + "";
            answer += Integer.valueOf(temp);
        }
        return answer;
    }
}