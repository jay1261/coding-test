import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i = 0; i < skill.length(); i++){
            map.put(skill.charAt(i), i);
        }
        
        
        // System.out.println(map);
        
        for(String str: skill_trees){
            boolean flag = true;
            int index = 0;
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                // System.out.println("c = " + c);

                if(map.containsKey(c)){
                    int num = map.get(c);
                    if(num == index){
                        index++;
                    } else {
                        // System.out.println("???: "+ str);

                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println(str);

                answer++;
            }
        }
        
        
        
        return answer;
    }
}

