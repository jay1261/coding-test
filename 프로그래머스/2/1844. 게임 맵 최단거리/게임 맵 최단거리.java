import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        // 상하좌우
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] visited = new boolean[n][m];
        int[][] distance = new int[n][m];
        
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        distance[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            if(x == n-1 && y == m-1){
                return distance[x][y];
            }
            
            for(int i = 0; i < 4; i++){
                int nextX = dx[i] + x;
                int nextY = dy[i] + y;
                if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m && !visited[nextX][nextY] && maps[nextX][nextY] == 1) {
                    queue.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    distance[nextX][nextY] = distance[x][y] + 1;
                }
            }
        }
        
        return -1;
    }
}