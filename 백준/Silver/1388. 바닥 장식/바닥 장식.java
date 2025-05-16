import java.util.*;

class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();        
        boolean[][] visited = new boolean[n][m];
        char[][] map = new char[n][m];
        
        for(int i = 0; i < n; i++){
            map[i] = sc.nextLine().toCharArray();
        }
        
        int answer = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(!visited[i][j]){
                    char wood = map[i][j];
                    answer += move(map, visited, i, j, wood);
                }
            }
        }
        System.out.println(answer);
    }
    
    public static int move(char[][] map, boolean[][] visited, int x, int y, char direction){
        visited[x][y] = true;
        int count = 1;
        
        if(direction == '-') {
            y++;
            while(y < map[0].length && map[x][y] == '-') {
                visited[x][y] = true;
                y++;
            }
        } else {
            x++;
            while(x < map.length && map[x][y] == '|') {
                visited[x][y] = true;
                x++;
            }
        }
        return count;
    }
}