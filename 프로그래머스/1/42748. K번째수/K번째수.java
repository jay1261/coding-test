import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        int index = 0;
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int k = commands[i][2]-1;
            
            int[] temp = new int[end-start+1];
            
            for (int j = start; j <= end; j++){
                temp[j-start] = array[j];
            }
            
            Arrays.sort(temp);
            answer[index++] = temp[k];
        }
        
        return answer;
    }
}