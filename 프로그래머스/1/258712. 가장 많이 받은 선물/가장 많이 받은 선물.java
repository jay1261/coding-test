import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> giftGrades = new HashMap<>();
        HashMap<String, HashMap<String, Integer>> recode = new HashMap<>();
        
        for(int i = 0; i < gifts.length; i++){
            String[] splited = gifts[i].split(" ");
            giftGrades.put(splited[0], giftGrades.getOrDefault(splited[0], 0) + 1);
            giftGrades.put(splited[1], giftGrades.getOrDefault(splited[1], 0) - 1);
            
            HashMap<String, Integer> map = recode.getOrDefault(splited[0], new HashMap<String, Integer>());
            map.put(splited[1], map.getOrDefault(splited[1], 0) + 1);
            recode.put(splited[0], map);
        }
        
        System.out.println(giftGrades.toString());
        System.out.println(recode.toString());
        
        HashMap<String, Integer> nextMonth = new HashMap<>();
        for(int i = 0; i < friends.length; i++){
            for(int j = i; j < friends.length; j++){
                if(i == j) continue;
                
                String a = friends[i];
                String b = friends[j];
                
                int aCount = recode.getOrDefault(a, new HashMap<String, Integer>()).getOrDefault(b, 0); 
                int bCount = recode.getOrDefault(b, new HashMap<String, Integer>()).getOrDefault(a, 0);
                
                if(aCount < bCount){
                    nextMonth.put(b, nextMonth.getOrDefault(b, 0) + 1);
                } else if(aCount > bCount){
                    nextMonth.put(a, nextMonth.getOrDefault(a, 0) + 1);
                } else {
                    
                    int aGrade = giftGrades.getOrDefault(a, 0);
                    int bGrade = giftGrades.getOrDefault(b, 0);
                    
                    if(aGrade < bGrade) {
                        nextMonth.put(b, nextMonth.getOrDefault(b, 0) + 1);
                    } else if(aGrade > bGrade) {
                        nextMonth.put(a, nextMonth.getOrDefault(a, 0) + 1);
                    }
                }
            }
        }
        
        
         
        return nextMonth.values().stream().mapToInt(i->i).max().orElse(0);
    }
}
 