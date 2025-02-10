import java.util.*;

public class Main {
    static int answer = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        char[][] map = new char[r][c];

        for(int i = 0; i < r; i++){
            map[i] = sc.nextLine().toCharArray();
        }

        boolean[][] visited = new boolean[r][c];
        visited[map.length-1][0] = true;
        dfs(map, visited, map.length-1, 0, 1, k);

        System.out.println(answer);
    }

    public static void dfs(char[][] map, boolean[][] visited, int x, int y, int distance, int k){

        if(x == 0 && y == map[0].length-1){
            if(distance == k){
                answer++;
            }
            return;
        }

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < map.length && ny < map[0].length && map[nx][ny] == '.' && !visited[nx][ny]){
                visited[nx][ny] = true;
                distance++;
                dfs(map, visited, nx, ny, distance, k);
                distance--;
                visited[nx][ny] = false;
            }
        }
    }

}
