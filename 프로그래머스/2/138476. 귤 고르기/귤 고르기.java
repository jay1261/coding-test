import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int t: tangerine){
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
        
        int answer = 0;
        for(int i = 0; i < list.size(); i++){
            // System.out.println("k = " + k + ", answer = " + answer);
            if(k > 0){
               answer++;
            }
            k = k - list.get(i);
        }
        
        
        return answer;
    }
}

// 2 - 4 = -2 