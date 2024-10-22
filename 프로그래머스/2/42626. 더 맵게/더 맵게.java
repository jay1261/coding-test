import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        int answer = 0;
        for(int ele: scoville){
            pQueue.add(ele);
        }
        
        while(pQueue.peek() < K){
            if(pQueue.size() < 2){
                return -1;
            }
            int a = pQueue.poll();
            int b = pQueue.poll();
            
            pQueue.add(a+b*2);
            answer++;
        }
        // System.out.println(pQueue);
        return answer;
    }
}
// 1 1 2 2 50 50 
    
// 3 2 2 50 50 
// 7 2 50 50
// 11 50 50

// 111 50