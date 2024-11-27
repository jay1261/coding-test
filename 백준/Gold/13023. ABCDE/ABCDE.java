import java.util.*;

class Main{
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    static boolean flag = false;
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            map.put(i, new ArrayList<Integer>());
        }
        
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            map.get(a).add(b);
            map.get(b).add(a);
        }
        
        boolean[] visited = new boolean[N];

        for(int i = 0; i < N; i++){
            if(!flag){
                dfs(i, 1, visited);
            }
        }
        
        if(flag){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void dfs(int node, int depth, boolean[] visited){
        if(depth == 5){
            flag = true;
            return;
        }
        
        visited[node] = true;
        
        ArrayList<Integer> list = map.get(node);
        for(int num: list){
            if(!visited[num]){
                dfs(num, depth+1, visited);
            }
        }
        visited[node] = false;
        
    }
}