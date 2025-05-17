import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int[][] distances = new int[n][m];
        int[] start = {0,0};
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        queue.offer(start);
        visited[0][0] = true;
        distances[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            if(cx == n-1 && cy == m-1){
                answer = distances[cx][cy];
                
            }
            
            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx < n && nx >= 0 && ny < m && ny >= 0 && maps[nx][ny] == 1&& !visited[nx][ny]) {
                    distances[nx][ny] = distances[cx][cy] + 1;
                    visited[nx][ny] = true;
                    int[] next = {nx, ny};
                    queue.offer(next);
                }
            }
        }
        
        
        
        return answer;
    }
}