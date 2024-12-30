import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] map = new int[n+1][n+1];

            
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int num = sc.nextInt();
                map[i][j] = map[i-1][j] + map[i][j-1] - map[i-1][j-1] + num;
            }
        }
        
        for(int i = 0; i < m; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            System.out.println(map[x2][y2] - map[x1-1][y2] - map[x2][y1-1] + map[x1-1][y1-1]);
        }
        

   }
}