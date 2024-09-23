import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int t = Arrays.stream(nums).sum();
        int answer = 0;
        boolean[] isPrime = new boolean[t+1];
        Arrays.fill(isPrime, true);
        
        for(int i = 2; i + i <= t; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= t; j += i){
                    isPrime[j] = false;
                }
            }
        }

        
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(isPrime[(nums[i] + nums[j] + nums[k])]){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}