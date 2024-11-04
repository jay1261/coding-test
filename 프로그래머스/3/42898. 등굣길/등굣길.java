import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[m][n];
        for(int i = 0; i < puddles.length; i++){
            map[puddles[i][0] - 1][puddles[i][1] - 1] = -1;
        }
        
        // System.out.println(Arrays.toString(map));
        map[0][0] = 1;
        int answer = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == -1){
                    continue;
                }
                
                if(i > 0 && map[i-1][j] > 0){
                    map[i][j] = (map[i][j] + map[i-1][j]) % 1000000007;
                }
                
                if(j > 0 && map[i][j-1] > 0){
                    map[i][j] = (map[i][j] + map[i][j-1]) % 1000000007;
                }
            }
        }
        return map[m-1][n-1];
    }
}
