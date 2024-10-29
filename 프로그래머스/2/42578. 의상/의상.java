import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] sArr: clothes){
            map.put(sArr[1], map.getOrDefault(sArr[1], 0) + 1);
        }
        System.out.println(map);
        
        int answer = 1;
        
        for(int num: map.values()){
             answer *= (num + 1);
        }
        
        
        return answer - 1;
    }
}

