import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int boxCount = score.length / m;
        int answer = 0;
        for(int i = score.length - m; i >= score.length - (boxCount * m); i-= m){
            answer += score[i] * m;
        }
        
        return answer;
    }
}