import java.util.*;

class Main{
    static int answer = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] map = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                map[i][j] = sc.nextInt();
            }
        }

        //=====================================
        boolean visited[][] = new boolean[n][n];
        visited[0][0] = true;

        dfs(map, visited, 0, 0);
        if(answer == 1){
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    public static void dfs(int[][] map, boolean[][] visited, int x, int y){
        if(map[x][y] == -1){
            answer = 1;
        }

        int jumpPower = map[x][y];

        int nx = x + jumpPower;
        int ny = y + jumpPower;

        if(nx < map.length && !visited[nx][y]) {
            visited[nx][y] = true;
            dfs(map, visited, nx, y);
            visited[nx][y] = false;
        } 
        if(ny < map.length && !visited[x][ny]) {
            visited[x][ny] = true;
            dfs(map, visited, x, ny);
            visited[x][ny] = false;
        } 
    }

}