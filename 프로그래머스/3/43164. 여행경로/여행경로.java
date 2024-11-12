import java.util.*;

class Solution {
    // static ArrayList<ArrayList<String>> result = new ArrayList<>();
    static boolean flag = false;
    static String[] answer;

    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length];
        HashMap<String, ArrayList<Node>> map = new HashMap<>();
        
        Arrays.sort(tickets, (o1, o2) -> o1[1].compareTo(o2[1]));
        
        for(int i = 0; i < tickets.length; i++){
            map.put(tickets[i][0], new ArrayList<>());
        }
        for(int i = 0; i < tickets.length; i++){
            map.get(tickets[i][0]).add(new Node(tickets[i][1], i));
        }
    
        for(String[] a: tickets){
            System.out.print(Arrays.toString(a) + " ");
        }
        System.out.println("");
        
        ArrayList<String> list = new ArrayList<>();
        boolean[] visited = new boolean[tickets.length];
        list.add("ICN");
        dfs(map, list, "ICN", visited, tickets.length);
        
        
        return answer;
        
    }
    
    public void dfs(HashMap<String, ArrayList<Node>> map, ArrayList<String> list, String current, boolean[] visited, int length){
        if(flag) return;
        if(list.size() == length + 1){
            flag = true;
            answer = list.stream().toArray(String[]::new);
        }
        
        ArrayList<Node> nodes = map.getOrDefault(current, new ArrayList<>());
        for(Node node: nodes){
            if(!visited[node.index]){
                visited[node.index] = true;
                list.add(node.airport);
                // System.out.println(list);
                
                dfs(map, list, node.airport, visited, length);
                visited[node.index] = false;
                list.remove(list.size() - 1);
            }
        }
    }
    
    class Node{
        String airport;
        int index;
        
        public Node(String airport, int index){
            this.airport = airport;
            this.index = index;
        }
        
        @Override
        public String toString(){
            return "[" + airport + ", " + index + "]";
        }
    }    
}
    