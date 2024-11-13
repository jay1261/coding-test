import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        
        ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
        
        for(int i = 0; i <= n; i++){
            grid.add(new ArrayList<>());
        }
        
        for(int i = 0; i < wires.length; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            grid.get(a).add(b);
            grid.get(b).add(a);
        }
        
        int answer = n;
        
        // System.out.println(grid);
        
        for(int[] wire: wires){
            int node1 = wire[0];
            int node2 = wire[1];
            
            grid.get(node1).remove((Integer) node2);
            grid.get(node2).remove((Integer) node1);
            boolean[] visited = new boolean[n+1];
            int count = dfs(grid, node1, visited);
            
            answer = Math.min(answer, Math.abs(count - (n-count)));
            // System.out.println("count: " + count);
            // System.out.println("count2: " + (n - count));
            
            grid.get(node1).add(node2);
            grid.get(node2).add(node1);
        }
        
        
        
        return answer;
    }
    
    public int dfs(ArrayList<ArrayList<Integer>> grid, int start, boolean[] visited ){
        ArrayList<Integer> list = grid.get(start);
        visited[start] = true;

        int result = 1;
        for(int num: list){
            if(!visited[num]){
                result += dfs(grid, num, visited);
            }
        }
        return result;
    }
}
