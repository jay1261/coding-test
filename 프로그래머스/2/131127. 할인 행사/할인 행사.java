import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        int answer = 0;
        
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }
        
        
        for(int i = 0; i < discount.length; i++){
            queue.offer(discount[i]);
            // map에 있으면 줄여주기
            if(map.containsKey(discount[i])){
                map.put(discount[i], map.get(discount[i]) - 1);
            }
            
            // 10개 차면 연속할인 되는지 확인
            if(queue.size() == 10){
                boolean flag = true;
                for(Integer n : map.values()){
                    if(n != 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
                
                
                String polled = queue.poll();
                if(map.containsKey(polled)){
                    map.put(polled, map.get(polled) + 1);
                }
            }
            
            
        }
        
        return answer;
    }
}

//  회원권 10일 유지

//  ["banana", "apple", "rice", "pork", "pot"]
//  [3,         2,       2,      2,      1]
//  ["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"]