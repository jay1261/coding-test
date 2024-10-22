import java.util.*;

class Solution {
    public int solution(int[] topping) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int answer = 0;
        
        for(int i = 0; i < topping.length; i++){
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }
        
        for(int i = 0; i < topping.length; i++){
            map2.put(topping[i], map2.getOrDefault(topping[i], 0) + 1);
            
            int tmp = map.getOrDefault(topping[i], -1);
            map.put(topping[i], tmp -1);
            if(tmp-1 <= 0){
                map.remove(topping[i]);
            }
            
            // System.out.println("A: " + map);
            // System.out.println("B: " +map2);
            
            if(map2.size() == map.size()){
                answer++;
            }
        }
        
        return answer;
    }
}