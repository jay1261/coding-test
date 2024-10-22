import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        
        int index = 0;
        for(long i = left; i <= right; i++){
            int j = (int) (i / n);
            int k = (int) (i % n);
            answer[index++] = j > k ? j+1 : k+1;
        }
        
        return answer;
    }
}