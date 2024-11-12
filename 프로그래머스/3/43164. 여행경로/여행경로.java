import java.util.*;

class Solution {
    
    public String[] solution(String[][] tickets) {
        String[] result = new String[tickets.length + 1];
        boolean[] visited = new boolean[tickets.length];
        
        dfs(tickets, visited, result, "ICN", 0);
        
        return result;
    }
    
    public void dfs(String[][] tickets, boolean[] visited, String[] result, String current, int depth){
        if(depth > tickets.length){
            return;
        }
        
        result[depth] = current;
        
        ArrayList<Node> list = new ArrayList<>();
        
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i][0].equals(current) && !visited[i]){
                list.add(new Node(tickets[i][1], i));
            }
        }
        
        list.sort((o1, o2) -> o2.airport.compareTo(o1.airport));
        
        for(Node node: list){
            visited[node.index] = true;
            dfs(tickets, visited, result, node.airport, depth+1);
            visited[node.index] = false;
        }
    }
    
    class Node{
        String airport;
        int index;
        
        public Node(String airport, int index){
            this.airport = airport;
            this.index = index;
        }
    }
}