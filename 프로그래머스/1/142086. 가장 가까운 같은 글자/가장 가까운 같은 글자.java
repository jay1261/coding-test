import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        List<String> strList = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            String alpha = s.charAt(i) + "";
            if(!strList.contains(alpha)){
                strList.add(alpha);
                answer[i] = -1;
                continue;
            }
            
            int index = i;
            while(true){
                index--;
                if((s.charAt(index)+"").equals(alpha)){
                    break;
                }
                
            }
            answer[i] = i - index;
            
        }
        
        return answer;
    }
}