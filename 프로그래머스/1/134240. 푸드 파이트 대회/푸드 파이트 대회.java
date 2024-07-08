import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++){
                sb.append(i);
            }
        }
        
        String reversed = sb.reverse().toString();
        sb.reverse();
        sb.append(0).append(reversed); 
        
        return sb.toString();
    }
}