import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] arr = {"a","e","i","o","u"};
        String answer = "";
        
        for(int i = 0 ; i < my_string.length(); i++){
            if (Arrays.asList(arr).contains(my_string.charAt(i) + "")){
                continue;
            }
            answer += (my_string.charAt(i) + "");
        }
        
        return answer;
    }
}