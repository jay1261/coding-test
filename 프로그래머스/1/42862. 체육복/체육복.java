import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int answer = n - lost.length;
        
        
    // 여유가 있는 학생이 도난당한 경우 처리
        for(int i = 0; i < reserve.length; i++){            
            for(int j = 0; j < lost.length; j++){
                if(reserve[i] == lost[j]){
                    lost[j] = -1;
                    reserve[i] = -3;
                    answer++;
                    break;
                }
            }
        }
        
    // 나머지 처리        
        for(int i = 0; i < reserve.length; i++){           
            int left = reserve[i] - 1; 
            int right = reserve[i] + 1; 
            
            for(int j = 0; j < lost.length; j++){
                if(left == lost[j]){
                    answer++;
                    lost[j] = -1;
                    break;
                } else if (right == lost[j]){
                    answer++;
                    lost[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}