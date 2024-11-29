import java.util.*;

class Main{

    static HashSet<String> set = new HashSet<>();
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};        
    static int[][] map = new int[5][5];

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int n = sc.nextInt();
                map[i][j] = n;
            }
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                dfs(i, j, "", 1);
            }
        }
        System.out.println(set.size());
    }
    
    public static void dfs(int x, int y, String str, int depth){
        if(depth == 7){
            set.add(str);
            return;
        }

        int n = map[x][y];
        
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < 5 && ny < 5){
                dfs(nx, ny, str + n, depth+1);
            }
        }
    }
}