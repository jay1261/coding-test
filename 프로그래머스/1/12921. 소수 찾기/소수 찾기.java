import java.util.*;
class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;
        
        
        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        
        int answer = 0;
        
        for(int i = 0; i < isPrime.length; i++){
            if(isPrime[i]){
                answer++;
            }
        }
        
        return answer;
        
        // int answer = 0;
        // for(int i = 2; i <= n; i++){
        //     boolean temp = true;
        //     for(int j = 2; j <= Math.sqrt(i); j++){
        //         if(i % j == 0){
        //             temp = false;
        //             // System.out.println("(" + i + "," + j+")");
        //             break;
        //         }
        //     }
        //     if (temp){
        //         // System.out.println(i);
        //         answer++;
        //     }
        // }
        // return answer;
    }
}