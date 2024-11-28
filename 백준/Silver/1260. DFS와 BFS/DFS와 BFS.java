import java.util.*;
class Main{

    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        for(int i = 1; i <= N; i++){
            map.put(i, new ArrayList<Integer>());
        }

        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            map.get(a).add(b);
            map.get(b).add(a);
        }

        for(int i = 1; i <= N; i++){
            Collections.sort(map.get(i));
        }

        boolean[] visited = new boolean[N+1];
        System.out.print(V);
        visited[V] = true;
        dfs(V, visited);
        
        System.out.println("");
        visited = new boolean[N+1];
        bfs(V, visited);
    }

    public static void dfs(int start, boolean[] visited){
        ArrayList<Integer> list = map.get(start);

        for(int num: list){
            if(!visited[num]){
                visited[num] = true;
                System.out.print(" " + num);
                dfs(num, visited);
            }
        }
    }
    
    public static void bfs(int start, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(start);
        visited[start] = true;
        System.out.print(start);
        
        while(!queue.isEmpty()){
            int current = queue.poll();
            ArrayList<Integer> list = map.get(current);
            
            for(int num: list){
                if(!visited[num]){
                    visited[num] = true;
                    System.out.print(" " + num);
                    queue.offer(num);
                }
            }
        }
        
    }
}