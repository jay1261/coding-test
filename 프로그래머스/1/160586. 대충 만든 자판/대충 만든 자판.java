import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(String str: keymap){
            for(int i = 0; i < str.length(); i++){
                if(!map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i), i+1);
                }
                else if(map.get(str.charAt(i)) > i){
                    map.put(str.charAt(i), i+1);
                    continue;
                }
            }
        }
        
        // System.out.println(map.toString());
        
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++) {
            int count = 0;
            boolean flag = true;
            for(Character c: targets[i].toCharArray()){
                int tmp = map.getOrDefault(c, -1);

                if(tmp == -1){
                    flag = false;
                    break;
                }
                count += tmp;
            }
            if(flag) answer[i] = count;
            else answer[i] = -1;           
        }
        
        
        return answer;
    }
}