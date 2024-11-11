import java.util.*;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        int[][] grid = new int[104][104];
        
        for(int[] rect: rectangle){
            int x1 = rect[0]*2;
            int y1 = rect[1]*2;
            int x2 = rect[2]*2;
            int y2 = rect[3]*2;
            for(int i = x1; i <= x2; i++){
                for(int j = y1; j <= y2; j++){
                    grid[i][j] = 1;
                }
            }
        }
        
//         for(int i = 0; i < grid.length; i++){
//             for(int j = 0; j < grid.length; j++){
//                 System.out.print(grid[i][j] + " ");
//             }
//             System.out.println("");
//         }
        
        return bfs(grid, new int[]{characterX*2, characterY*2}, new int[] {itemX*2, itemY*2}) / 2;
    }
    
    public int bfs(int[][] grid, int[] start, int[] end){
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid.length];
        int[][] distances = new int[grid.length][grid.length];
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        queue.offer(start);
        visited[start[0]][start[1]] = true;
        
        while(!queue.isEmpty()){
            // System.out.println(queue);
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            if(cx == end[0] && cy == end[1]){
                return distances[cx][cy];
            }
            
            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(grid[nx][ny] == 1 && !visited[nx][ny] && check(grid, nx, ny)){
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    distances[nx][ny] = distances[cx][cy] + 1;
                }
            }
        }       
        return 0;
    }
    
    public boolean check(int[][] grid, int x, int y){
        for(int i = x - 1; i <= x + 1; i++){
            for(int j = y - 1; j <= y + 1; j++){
                if(grid[i][j] == 0){
                    return true;
                }
            }
        }
        return false;
    }
}

//{0,1} {0, 3} {2, 1} {2 3}
