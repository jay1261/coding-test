import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {

        int answer = dfs(0, 0, numbers, target);
        
        return answer;
    }
    
    public int dfs(int depth, int sum, int[] numbers, int target){
        if(depth == numbers.length){
            
            return sum == target ? 1 : 0;
        }
        
        return dfs(depth+1, sum+numbers[depth], numbers, target) + dfs(depth+1, sum-numbers[depth], numbers, target);
    }
}