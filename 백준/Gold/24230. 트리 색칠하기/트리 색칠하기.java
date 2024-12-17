import java.util.*;

class Main{
    static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    static int count = 0;
    static int[] target;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        target = new int[n+1];

        for(int i = 1; i <= n; i++){
            target[i] = sc.nextInt();
            graph.put(i, new ArrayList<Integer>());
        }

        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n+1];
        
        if(target[1] != 0){
            count++;
        }
        visited[1] = true;
        dfs(1, target[1], visited);
        
        System.out.println(count);
    }

    public static void dfs(int node, int color, boolean[] visited){
        ArrayList<Integer> list = graph.get(node);
        
        for(int num: list){
            if(!visited[num]){
                visited[num] = true;
                if(target[num] != color){
                    count++;
                    dfs(num, target[num], visited);
                } else {
                    dfs(num, color, visited);
                }
            }
        }
    }
}