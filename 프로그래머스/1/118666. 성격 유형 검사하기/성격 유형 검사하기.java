import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] types = {'R','T','C','F','J','M','A','N'};
        for(int i = 0; i < choices.length; i++){
            String type = survey[i];
            int choice = choices[i];
            
            if (choice < 4){
                map.put(type.charAt(0), map.getOrDefault(type.charAt(0), 0) + (4 - choice));
            } else if( choice > 4){
                map.put(type.charAt(1), map.getOrDefault(type.charAt(1), 0) + (choice - 4));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < types.length; i+=2){
            sb.append(map.getOrDefault(types[i], 0) >= map.getOrDefault(types[i+1], 0) ? types[i] : types[i+1]);
        }
        
        return sb.toString();
    }
}