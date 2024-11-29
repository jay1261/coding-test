import java.util.*;

class Main{
    static int[][] map;
    static int[] dy = {1, -1, 0, 0};
    static int[] dx = {0, 0, 1, -1};
    static int maxCount = 1;
    static boolean[][] visited;
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        map = new int[N+2][M+2];    
        
        for(int i = 0; i < K; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            map[x][y] = 1;
        }
        visited = new boolean[N+1][M+1];
        

        int count = 0;
        
        for(int y = 1; y <= N; y++){
            for(int x = 1; x <= M; x++){
                if(map[y][x] == 1 &&!visited[y][x]){
                    dfs(y, x);
                }
                count = Math.max(maxCount, count);
                maxCount = 1;

            }
        }
        
        System.out.println(count);
    }
    
    public static void dfs(int y, int x){
        visited[y][x] = true;
        
        for(int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            
            if(map[ny][nx] == 1 && !visited[ny][nx]){
                maxCount++;
                dfs(ny, nx);
            }
        }
    }
}