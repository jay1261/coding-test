import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean[][] map = new boolean[n][m];

        for(int i = 0; i < k; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j = x1; j < x2; j++){
                for(int l = y1; l < y2; l++){
                    map[j][l] = true;
                }
            }

        }

        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(map[i][j]) continue;

                int[] start = {i,j};
                int result = bfs(map, start);
                list.add(result);
                answer++;
            }
        }
        Collections.sort(list);
        System.out.println(answer);
        for(int num: list){
            System.out.print(num + " ");
        }

    }

    public static int bfs(boolean[][] map, int[] start){
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        queue.offer(start);
        map[start[0]][start[1]] = true;

        int count = 1;

        while(!queue.isEmpty()){
            int[] current = queue.poll();

            for(int i = 0; i < 4; i++){
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if(nx >= 0 && nx < map.length && ny >=0 && ny < map[0].length && !map[nx][ny]){
                    int[] next = {nx, ny};
                    map[nx][ny] = true;
                    count++;
                    queue.offer(next);
                }
            }
        }

        return count;

    }


}
