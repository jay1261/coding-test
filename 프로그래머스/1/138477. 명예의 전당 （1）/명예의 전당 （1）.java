import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            if(queue.size() < k) {
                queue.add(score[i]);
            }
            
            else if(queue.peek() < score[i]){
                queue.poll();
                queue.add(score[i]);
            }
            
            answer[i] = queue.stream().min(Integer::compare).get();
        }
        
        return answer;
    }
}