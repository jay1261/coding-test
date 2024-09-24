import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap();
        
        for(int i = 0; i < participant.length; i++){            
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        for(int i = 0; i < completion.length; i++){
            if(!map.containsKey(completion[i])){
                return completion[i];
            } else {
                map.put(completion[i], map.get(completion[i]) - 1);
            }   
        }
        
        if(answer.equals("")){
            List<String> list = new ArrayList<>(map.keySet());
            list.sort((o1,o2)->Integer.compare(map.get(o2),map.get(o1)));
            answer = list.get(0);
        }
        
        return answer;
    }
}