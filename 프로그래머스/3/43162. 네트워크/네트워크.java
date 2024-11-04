import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        Stack<int[]> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        int answer = 0;
        
        for(int j = 0; j < n; j++){
            if(visited[j]){
               continue; 
            }
            stack.push(computers[j]);
            visited[j] = true;

            while(!stack.isEmpty()){
                int[] current = stack.pop();
                // System.out.println(Arrays.toString(current));

                for(int i = 0; i < n; i++){
                    int computer = current[i];
                    // System.out.println(computer);
                    if(computer == 1 && !visited[i]){
                        visited[i] = true;
                        stack.push(computers[i]);
                    }
                }
            }
            answer++;
        }
        // System.out.println(Arrays.toString(visited));
        return answer;
    }
    
}