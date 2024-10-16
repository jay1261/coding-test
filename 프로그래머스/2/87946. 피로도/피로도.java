
class Solution {
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, 0, dungeons, visited);
        
        return answer;
    }
    
    public void dfs(int k, int depth, int[][]dungeons, boolean[] visited){
        for(int i = 0; i < dungeons.length; i++){
            if(visited[i] || k < dungeons[i][0]) continue;
            
            visited[i] = true;
            dfs(k-dungeons[i][1], depth+1, dungeons, visited);
            visited[i] = false;
        }
        answer = Math.max(answer, depth);
    }
}


// 던전: A B C 

// A B C
// A C B
// B A C
// B C A
// C A B
// C B A


// 던전: A B C D

// A B C D
// A B D C
// A C B D
// A C D B
// A D B C
// A D C B
// BACD
// BADC
// BCAD
// BCDA
// BDAC
// BDCA
// ...