import java.util.*;

class Main{
    static boolean[][] grid;
    static boolean[] visited;
    static int n, m;
    
    public static void dfs(int index){
        visited[index] = true;
        
        for(int i = 1; i <= n; i++){
            if(grid[index][i] && !visited[i]){
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        grid = new boolean[n+1][n+1];
        visited = new boolean[n+1];
        
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            grid[x][y] = true;
            grid[y][x] = true;
        }
        
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}